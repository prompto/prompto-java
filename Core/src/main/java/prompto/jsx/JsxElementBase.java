package prompto.jsx;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.literal.DocEntry;
import prompto.literal.DocEntryList;
import prompto.literal.TypeLiteral;
import prompto.parser.CodeSection;
import prompto.parser.Dialect;
import prompto.parser.OCleverParser;
import prompto.processor.WidgetPropertiesProcessor;
import prompto.property.Property;
import prompto.property.PropertyMap;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.AnyType;
import prompto.type.CategoryType;
import prompto.type.IType;
import prompto.type.JsxType;

public abstract class JsxElementBase extends CodeSection implements IJsxExpression {

	Identifier id;
	List<JsxProperty> properties;
	
	public JsxElementBase(Identifier id, List<JsxProperty> attributes) {
		this.id = id;
		this.properties = attributes;
	}

	@Override
	public String toString() {
		return "<" + id.toString() + ">...</" + id.toString() + ">";
	}
	
	@Override
	public IType check(Context context) {
		if(isHtmlTag())
			checkHtml(context);
		else
			checkWidget(context);
		checkChildren(context);
		return JsxType.instance();
	}

	private void checkHtml(Context context) {
		checkHtmlProperties(context);
	}

	private void checkWidget(Context context) {
		checkConstructable(context);
		PropertyMap propertyMap = buildPropertyMap(context);
		checkWidgetProperties(context, propertyMap);
	}

	private PropertyMap buildPropertyMap(Context context) {
		CategoryType type = new CategoryType(id);
		Context instance = context.newInstanceContext(type, true);
		return getPropertyMap(instance);
	}

	private void checkConstructable(Context context) {
		CategoryType type = new CategoryType(id);
		CategoryDeclaration decl = context.getRegisteredDeclaration(CategoryDeclaration.class, type.getTypeNameId());
		if(decl==null || !decl.isAWidget(context))
			context.getProblemListener().reportUnknownWidget(this, type.getTypeName());
		if(decl!=null)
			decl.getAbstractMethods(context, this).forEach(method->context.getProblemListener().reportIllegalAbstractWidget(this, decl.getName(), method.getSignature(Dialect.O)));	
	}
	
	protected void checkChildren(Context context) {
	}

	private PropertyMap getPropertyMap(Context context) {
		if(isHtmlTag())
			return getHtmlPropertyTypes(context, id.toString());
		else {
			IDeclaration decl = context.getRegisteredDeclaration(IDeclaration.class, id);
			if(decl==null) {
				context.getProblemListener().reportUnknownIdentifier(id, id.toString());
				return null;
			} else if(decl instanceof CategoryDeclaration && ((CategoryDeclaration)decl).isAWidget(context))
				return ((CategoryDeclaration)decl).asWidget().getProperties();
			else
				return null;
		}
	}

	private boolean isHtmlTag() {
		return Character.isLowerCase(id.toString().charAt(0));
	}

	private void checkWidgetProperties(Context context, PropertyMap propertyMap) {
		Set<String> actualNames = new HashSet<>();
		if(properties!=null)
			properties.forEach(prop->{
				if(actualNames.contains(prop.getName()))
					context.getProblemListener().reportDuplicateProperty(prop, prop.getName());
				else
					actualNames.add(prop.getName());
				if(propertyMap!=null) {
					Property declared = propertyMap.get(prop.getName());
					if(declared==null)
						declared = getHtmlPropertyTypes(context, null).get(prop.getName());
					if(declared==null)
						declared = getHtmlPropertyTypes(context, null).get(prop.getName().toLowerCase()); // TODO generate camel case html property types
					if(declared==null)
						context.getProblemListener().reportUnknownProperty(prop, prop.getName());
					else
						declared.validate(context, prop);
				} else
					prop.check(context);
			});
		if(propertyMap!=null) {
			propertyMap.entrySet().stream()
				.filter(e->e.getValue().isRequired())
				.forEach(e->{
					if(properties==null || !actualNames.contains(e.getKey()))
						context.getProblemListener().reportMissingProperty(this, e.getKey());
				});
		}
	}
	
	private void checkHtmlProperties(Context context) {
		PropertyMap propertyMap = getHtmlPropertyTypes(context, id.toString());
		Set<String> actualNames = new HashSet<>();
		if(properties!=null)
			properties.forEach(prop->{
				if(actualNames.contains(prop.getName()))
					context.getProblemListener().reportDuplicateProperty(prop, prop.getName());
				else
					actualNames.add(prop.getName());
				Property declared = propertyMap.get(prop.getName());
				if(declared==null)
					declared = propertyMap.get(prop.getName().toLowerCase()); // TODO generate camel case html property types
				if(declared==null)
					context.getProblemListener().reportUnknownProperty(prop, prop.getName());
				else
					declared.validate(context, prop);
			});
		if(propertyMap!=null) {
			propertyMap.entrySet().stream()
				.filter(e->e.getValue().isRequired())
				.forEach(e->{
					if(properties==null || !actualNames.contains(e.getKey()))
						context.getProblemListener().reportMissingProperty(this, e.getKey());
				});
		}
	}
	
	// ensure this stays in sync with JavaScript version
	static final String HTML_PROPERTY_TYPES = "{\n"
		+ "abbr: { type: Text, help: \"Alternative label to use for the header cell when referencing the cell in other contexts\"},\n"
		+ "accept: { type: any, help: \"Hint for expected file type in file upload controls\"},\n"
		+ "\"accept-charset\": { type: any, help: \"Character encodings to use for form submission\"},\n"
		+ "accesskey: { type: any, help: \"Keyboard shortcut to activate or focus element\"},\n"
		+ "action: { type: Text, help: \"URL to use for form submission\"},\n"
		+ "allow: { type: Text, help: \"Feature policy to be applied to the iframe's contents\"},\n"
		+ "allowfullscreen: { type: Boolean, help: \"Whether to allow the iframe's contents to use requestFullscreen()\"},\n"
		+ "allowpaymentrequest: { type: Boolean, help: \"Whether the iframe's contents are allowed to use the PaymentRequest interface to make payment requests\"},\n"
		+ "alt: { type: Text, help: \"Replacement text for use when images are not available\"},\n"
		+ "as: { type: any, help: \"Potential destination for a preload request (for rel='preload' and rel='modulepreload')\"},\n"
		+ "async: { type: Boolean, help: \"Execute script when available, without blocking while fetching\"},\n"
		+ "autocapitalize: { values: <null, \"characters\", \"sentences\", \"words\", \"none\", \"off\", \"on\">, help: \"Recommended autocapitalization behavior (for supported input methods)\"},\n"
		+ "autocomplete: { values: <null, \"off\", \"on\">, help: \"Default setting for autofill feature for controls in the form\"},\n"
		+ "autofocus: { type: Boolean, help: \"Automatically focus the element when the page is loaded\"},\n"
		+ "autoplay: { type: Boolean, help: \"Hint that the media resource can be started automatically when the page is loaded\"},\n"
		+ "charset: { type: Text, help: \"Character encoding declaration\"},\n"
		+ "checked: { type: Boolean, help: \"Whether the control is checked\"},\n"
		+ "cite: { type: Text, help: \"Link to the source of the quotation or more information about the edit\"},\n"
		+ "class: { type: Text, help: \"Classes to which the element belongs\"},\n"
		+ "color: { type: Text, help: \"Color to use when customizing a site's icon (for rel='mask-icon')\"},\n"
		+ "cols: { type: Integer, help: \"Maximum number of characters per line\"},\n"
		+ "colspan: { type: Integer, help: \"Number of columns that the cell is to span\"},\n"
		+ "content: { type: Text, help: \"Value of the element\"},\n"
		+ "contenteditable: { type: Boolean, help: \"Whether the element is editable\"},\n"
		+ "controls: { type: Boolean, help: \"Show user agent controls\"},\n"
		+ "coords: { type: Text, help: \"Coordinates for the shape to be created in an image map\"},\n"
		+ "crossorigin: { values: <null, \"anonymous\", \"use-credentials\">, help: \"How the element handles crossorigin requests\"},\n"
		+ "data: { type: Text, help: \"Address of the resource\"},\n"
		+ "datetime: { types: <Date, null, DateTime>, help: \"Date and (optionally) time of the change\"},\n"
		+ "decoding: { values: <null, \"async\", \"auto\", \"sync\">, help: \"Decoding hint to use when processing this image for presentation\"},\n"
		+ "default: { type: Boolean, help: \"Enable the track if no other text track is more suitable\"},\n"
		+ "defer: { type: Boolean, help: \"Defer script execution\"},\n"
		+ "dir: { values: <null, \"auto\", \"ltr\", \"rtl\">, help: \"The text directionality of the element\"},\n"
		+ "dirname: { type: Text, help: \"Name of form control to use for sending the element's directionality in form submission\"},\n"
		+ "disabled: { type: Boolean, help: \"Whether the form control is disabled\"},\n"
		+ "download: { type: any, help: \"Whether to download the resource instead of navigating to it, and its file name if so\"},\n"
		+ "draggable: { type: Boolean, help: \"Whether the element is draggable\"},\n"
		+ "enctype: { values: <null, \"multipart/form-data\", \"application/x-www-form-urlencoded\", \"text/plain\">, help: \"Entry list encoding type to use for form submission\"},\n"
		+ "enterkeyhint: { values: <\"next\", null, \"search\", \"previous\", \"go\", \"enter\", \"done\", \"send\">, help: \"Hint for selecting an enter key action\"},\n"
		+ "for: { type: any, help: \"Associate the label with form control\"},\n"
		+ "form: { type: any, help: \"Associates the element with a form element\"},\n"
		+ "formaction: { type: Text, help: \"URL to use for form submission\"},\n"
		+ "formenctype: { values: <null, \"multipart/form-data\", \"application/x-www-form-urlencoded\", \"text/plain\">, help: \"Entry list encoding type to use for form submission\"},\n"
		+ "formmethod: { values: <null, \"dialog\", \"POST\", \"GET\">, help: \"Variant to use for form submission\"},\n"
		+ "formnovalidate: { type: Boolean, help: \"Bypass form control validation for form submission\"},\n"
		+ "formtarget: { type: Text, help: \"Browsing context for form submission\"},\n"
		+ "headers: { type: any, help: \"The header cells for this cell\"},\n"
		+ "height: { type: Integer, help: \"Vertical dimension\"},\n"
		+ "hidden: { type: Boolean, help: \"Whether the element is relevant\"},\n"
		+ "high: { type: Decimal, help: \"Low limit of high range\"},\n"
		+ "href: { type: Text, help: \"Address of the hyperlink\"},\n"
		+ "hreflang: { type: any, help: \"Language of the linked resource\"},\n"
		+ "\"http-equiv\": { values: <\"default-style\", null, \"x-ua-compatible\", \"content-security-policy\", \"refresh\", \"content-type\">, help: \"Pragma directive\"},\n"
		+ "id: { type: Text, help: \"The element's ID\"},\n"
		+ "imagesizes: { type: Text, help: \"Image sizes for different page layouts\"},\n"
		+ "imagesrcset: { type: Text, help: \"Images to use in different situations (e.g., high-resolution displays, small monitors, etc.)\"},\n"
		+ "inputmode: { values: <null, \"search\", \"numeric\", \"tel\", \"none\", \"text\", \"decimal\", \"email\", \"url\">, help: \"Hint for selecting an input modality\"},\n"
		+ "integrity: { type: Text, help: \"Integrity metadata used in Subresource Integrity checks [SRI]\"},\n"
		+ "is: { type: any, help: \"Creates a customized built-in element\"},\n"
		+ "ismap: { type: Boolean, help: \"Whether the image is a server-side image map\"},\n"
		+ "itemid: { type: Text, help: \"Global identifier for a microdata item\"},\n"
		+ "itemprop: { type: any, help: \"Property names of a microdata item\"},\n"
		+ "itemref: { type: any, help: \"Referenced elements\"},\n"
		+ "itemscope: { type: Boolean, help: \"Introduces a microdata item\"},\n"
		+ "itemtype: { type: any, help: \"Item types of a microdata item\"},\n"
		+ "kind: { values: <null, \"subtitles\", \"metadata\", \"chapters\", \"descriptions\", \"captions\">, help: \"The type of text track\"},\n"
		+ "label: { type: Text, help: \"User-visible label\"},\n"
		+ "lang: { type: any, help: \"Language of the element\"},\n"
		+ "list: { type: any, help: \"List of autocomplete options\"},\n"
		+ "loop: { type: Boolean, help: \"Whether to loop the media resource\"},\n"
		+ "low: { type: Decimal, help: \"High limit of low range\"},\n"
		+ "manifest: { type: Text, help: \"Application cache manifest\"},\n"
		+ "max: { type: any, help: \"Maximum value\"},\n"
		+ "maxlength: { type: Integer, help: \"Maximum length of value\"},\n"
		+ "media: { type: Text, help: \"Applicable media\"},\n"
		+ "method: { values: <null, \"dialog\", \"POST\", \"GET\">, help: \"Variant to use for form submission\"},\n"
		+ "min: { type: any, help: \"Minimum value\"},\n"
		+ "minlength: { type: Integer, help: \"Minimum length of value\"},\n"
		+ "multiple: { type: Boolean, help: \"Whether to allow multiple values\"},\n"
		+ "muted: { type: Boolean, help: \"Whether to mute the media resource by default\"},\n"
		+ "name: { type: Text, help: \"Name of the element to use for form submission and in the form.elements API\"},\n"
		+ "nomodule: { type: Boolean, help: \"Prevents execution in user agents that support module scripts\"},\n"
		+ "nonce: { type: Text, help: \"Cryptographic nonce used in Content Security Policy checks [CSP]\"},\n"
		+ "novalidate: { type: Boolean, help: \"Bypass form control validation for form submission\"},\n"
		+ "open: { type: Boolean, help: \"Whether the details are visible\"},\n"
		+ "optimum: { type: Decimal, help: \"Optimum value in gauge\"},\n"
		+ "pattern: { type: Text, help: \"Pattern to be matched by the form control's value\"},\n"
		+ "ping: { type: any, help: \"URLs to ping\"},\n"
		+ "placeholder: { type: Text, help: \"User-visible label to be placed within the form control\"},\n"
		+ "playsinline: { type: Boolean, help: \"Encourage the user agent to display video content within the element's playback area\"},\n"
		+ "poster: { type: Text, help: \"Poster frame to show prior to video playback\"},\n"
		+ "preload: { values: <null, \"metadata\", \"auto\", \"none\">, help: \"Hints how much buffering the media resource will likely need\"},\n"
		+ "readonly: { type: Boolean, help: \"Whether to allow the value to be edited by the user\"},\n"
		+ "referrerpolicy: { values: <\"strict-origin-when-cross-origin\", null, \"strict-origin\", \"origin\", \"unsafe-url\", \"no-referrer\", \"same-origin\", \"no-referrer-when-downgrade\", \"origin-when-cross-origin\">, help: \"Referrer policy for fetches initiated by the element\"},\n"
		+ "rel: { type: Text, help: \"Relationship between the location in the document containing the hyperlink and the destination resource\"},\n"
		+ "required: { type: Boolean, help: \"Whether the control is required for form submission\"},\n"
		+ "reversed: { type: Boolean, help: \"Number the list backwards\"},\n"
		+ "rows: { type: Integer, help: \"Number of lines to show\"},\n"
		+ "rowspan: { type: Integer, help: \"Number of rows that the cell is to span\"},\n"
		+ "sandbox: { type: any, help: \"Security rules for nested content\"},\n"
		+ "scope: { values: <null, \"col\", \"row\", \"colgroup\", \"rowgroup\">, help: \"Specifies which cells the header cell applies to\"},\n"
		+ "selected: { type: Boolean, help: \"Whether the option is selected by default\"},\n"
		+ "shape: { values: <null, \"rect\", \"default\", \"poly\", \"circle\">, help: \"The kind of shape to be created in an image map\"},\n"
		+ "size: { type: Integer, help: \"Size of the control\"},\n"
		+ "sizes: { type: any, help: \"Sizes of the icons (for rel='icon')\"},\n"
		+ "slot: { type: Text, help: \"The element's desired slot\"},\n"
		+ "span: { type: Integer, help: \"Number of columns spanned by the element\"},\n"
		+ "spellcheck: { type: Boolean, help: \"Whether the element is to have its spelling and grammar checked\"},\n"
		+ "src: { type: Text, help: \"Address of the resource\"},\n"
		+ "srcdoc: { type: Text, help: \"A document to render in the iframe\"},\n"
		+ "srclang: { type: any, help: \"Language of the text track\"},\n"
		+ "srcset: { type: Text, help: \"Images to use in different situations (e.g., high-resolution displays, small monitors, etc.)\"},\n"
		+ "start: { type: Integer, help: \"Starting value of the list\"},\n"
		+ "step: { type: any, help: \"Granularity to be matched by the form control's value\"},\n"
		+ "style: { type: any, help: \"Presentational and formatting instructions\"},\n"
		+ "tabindex: { type: Integer, help: \"Whether the element is focusable, and the relative order of the element for the purposes of sequential focus navigation\"},\n"
		+ "target: { type: Text, help: \"Browsing context for hyperlink navigation\"},\n"
		+ "title: { type: Text, help: \"Advisory information for the element\"},\n"
		+ "translate: { values: <null, \"no\", \"yes\">, help: \"Whether the element is to be translated when the page is localized\"},\n"
		+ "type: { type: Text, help: \"Hint for the type of the referenced resource\"},\n"
		+ "usemap: { type: Text, help: \"Name of image map to use\"},\n"
		+ "value: { type: Text, help: \"Value to be used for form submission\"},\n"
		+ "width: { type: Integer, help: \"Horizontal dimension\"},\n"
		+ "wrap: { values: <null, \"hard\", \"soft\">, help: \"How the value of the form control is to be wrapped for form submission\"},\n"
		+ "dangerouslySetInnerHTML : { type: Document, help: \"Sets node.innerHtml\"},\n"
		+ "onClick: MouseEventCallback,\n"
		+ "onContextMenu: MouseEventCallback,\n"
	    + "onDoubleClick: MouseEventCallback,\n"
	    + "onMouseDown: MouseEventCallback,\n"
	    + "onMouseEnter: MouseEventCallback,\n"
	    + "onMouseLeave: MouseEventCallback,\n"
	    + "onMouseMove: MouseEventCallback,\n"
	    + "onMouseOut: MouseEventCallback,\n"
	    + "onMouseOver: MouseEventCallback,\n"
	    + "onMouseUp: MouseEventCallback,\n"
	    + "onKeyDown: KeyboardEventCallback,\n"
	    + "onKeyUp: KeyboardEventCallback,\n"
		+ "onSubmit: SubmitEventCallback,\n"
		+ "onChange: InputChangedCallback,\n"
		+ "key: Any\n"
		+ "}"; // TODO: 'key' is for React only

	static ThreadLocal<PropertyMap> HTML_PROPERTIES_MAP = new ThreadLocal<>();
	static ThreadLocal<Boolean> HTML_TEST_MODE = ThreadLocal.withInitial(()->false);

	public static void setTestMode(boolean set) {
		HTML_TEST_MODE.set(set);
		if(set)
			HTML_PROPERTIES_MAP.set(null);
	}
	
	
	private PropertyMap getHtmlPropertyTypes(Context context, String tagName) {
		if(HTML_PROPERTIES_MAP.get()==null) {
			OCleverParser parser = new OCleverParser(HTML_PROPERTY_TYPES);
			DocEntryList types = parser.parse_document_literal().getEntries();
		    if(HTML_TEST_MODE.get()) {
		        IExpression any = new TypeLiteral(AnyType.instance());
		        types = new DocEntryList(types.stream().map(e->new DocEntry(e.getKey(), any)).collect(Collectors.toList()));
		    }
			HTML_PROPERTIES_MAP.set(new WidgetPropertiesProcessor().loadProperties(null, context, types));
		}
		return HTML_PROPERTIES_MAP.get();
	}

	@Override
	public void declare(Transpiler transpiler) {
		if(!isHtmlTag()) {
			checkConstructable(transpiler.getContext());
			IDeclaration decl = transpiler.getContext().getRegisteredDeclaration(IDeclaration.class, id);
			if(decl!=null)
				decl.declare(transpiler.newLocalTranspiler());
		}
		if(this.properties!=null) {
			PropertyMap propertyMap = getPropertyMap(transpiler.getContext());
			PropertyMap htmlPropertyMap = isHtmlTag() ? null : getHtmlPropertyTypes(transpiler.getContext(), id.toString());
			this.properties.forEach(jsxprop -> {
				Property prop = propertyMap==null ? null : propertyMap.get(jsxprop.getName());
				if(prop==null)
					prop = htmlPropertyMap==null ? null : htmlPropertyMap.get(jsxprop.getName());
				if(prop==null)
					prop = htmlPropertyMap==null ? null : htmlPropertyMap.get(jsxprop.getName().toLowerCase()); // TODO generate camel case html property types
				jsxprop.declare(transpiler, prop );
			});
		}
		this.declareChildren(transpiler);
	}
	
	public void declareChildren(Transpiler transpiler) {
		// nothing to do
	}

	@Override
	public boolean transpile(Transpiler transpiler) {
		// TODO call htmlEngine
	    transpiler.append("React.createElement(");
	    if (!isHtmlTag())
	        transpiler.append(this.id.toString());
	    else
	        transpiler.append('"').append(this.id.toString()).append('"');
	    transpiler.append(", ");
	    if(this.properties==null || this.properties.isEmpty())
	        transpiler.append("null");
	    else {
	    	PropertyMap propertyMap = getPropertyMap(transpiler.getContext());
	    	PropertyMap htmlPropertyMap = isHtmlTag() ? null : getHtmlPropertyTypes(transpiler.getContext(), id.toString());
	        transpiler.append("{");
	        this.properties.forEach(jsxprop -> {
				Property prop = propertyMap==null ? null : propertyMap.get(jsxprop.getName());
				if(prop==null)
					prop = htmlPropertyMap==null ? null : htmlPropertyMap.get(jsxprop.getName());
				if(prop==null)
					prop = htmlPropertyMap==null ? null : htmlPropertyMap.get(jsxprop.getName().toLowerCase()); // TODO generate camel case html property types
	        	jsxprop.transpile(transpiler, prop);
	            transpiler.append(", ");
	        });
	        transpiler.trimLast(2).append("}");
	    }
	    this.transpileChildren(transpiler);
	    transpiler.append(")");
	    return false;
	}
	
	public void transpileChildren(Transpiler transpiler) {
		// nothing to do
	}
}
