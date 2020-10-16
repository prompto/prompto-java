package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAnnotations extends BaseOParserTest {

	@Test
	public void testReactWidgetProps1() throws Exception {
		compareResourceOEO("annotations/ReactWidgetProps1.poc");
	}

	@Test
	public void testReactWidgetProps2() throws Exception {
		compareResourceOEO("annotations/ReactWidgetProps2.poc");
	}

	@Test
	public void testWidgetChildProps1() throws Exception {
		compareResourceOEO("annotations/WidgetChildProps1.poc");
	}

	@Test
	public void testWidgetChildProps2() throws Exception {
		compareResourceOEO("annotations/WidgetChildProps2.poc");
	}

	@Test
	public void testWidgetField() throws Exception {
		compareResourceOEO("annotations/WidgetField.poc");
	}

	@Test
	public void testWidgetProps1() throws Exception {
		compareResourceOEO("annotations/WidgetProps1.poc");
	}

	@Test
	public void testWidgetProps10() throws Exception {
		compareResourceOEO("annotations/WidgetProps10.poc");
	}

	@Test
	public void testWidgetProps11() throws Exception {
		compareResourceOEO("annotations/WidgetProps11.poc");
	}

	@Test
	public void testWidgetProps12() throws Exception {
		compareResourceOEO("annotations/WidgetProps12.poc");
	}

	@Test
	public void testWidgetProps2() throws Exception {
		compareResourceOEO("annotations/WidgetProps2.poc");
	}

	@Test
	public void testWidgetProps3() throws Exception {
		compareResourceOEO("annotations/WidgetProps3.poc");
	}

	@Test
	public void testWidgetProps4() throws Exception {
		compareResourceOEO("annotations/WidgetProps4.poc");
	}

	@Test
	public void testWidgetProps5() throws Exception {
		compareResourceOEO("annotations/WidgetProps5.poc");
	}

	@Test
	public void testWidgetProps6() throws Exception {
		compareResourceOEO("annotations/WidgetProps6.poc");
	}

	@Test
	public void testWidgetProps7() throws Exception {
		compareResourceOEO("annotations/WidgetProps7.poc");
	}

	@Test
	public void testWidgetProps8() throws Exception {
		compareResourceOEO("annotations/WidgetProps8.poc");
	}

	@Test
	public void testWidgetProps9() throws Exception {
		compareResourceOEO("annotations/WidgetProps9.poc");
	}

	@Test
	public void testCallback() throws Exception {
		compareResourceOEO("annotations/callback.poc");
	}

	@Test
	public void testCategory() throws Exception {
		compareResourceOEO("annotations/category.poc");
	}

	@Test
	public void testInlined() throws Exception {
		compareResourceOEO("annotations/inlined.poc");
	}

}

