package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAnnotations extends BaseOParserTest {

	@Test
	public void testReactWidgetProps1() throws Exception {
		compareResourceOMO("annotations/ReactWidgetProps1.poc");
	}

	@Test
	public void testReactWidgetProps2() throws Exception {
		compareResourceOMO("annotations/ReactWidgetProps2.poc");
	}

	@Test
	public void testWidgetChildProps1() throws Exception {
		compareResourceOMO("annotations/WidgetChildProps1.poc");
	}

	@Test
	public void testWidgetChildProps2() throws Exception {
		compareResourceOMO("annotations/WidgetChildProps2.poc");
	}

	@Test
	public void testWidgetField() throws Exception {
		compareResourceOMO("annotations/WidgetField.poc");
	}

	@Test
	public void testWidgetProps1() throws Exception {
		compareResourceOMO("annotations/WidgetProps1.poc");
	}

	@Test
	public void testWidgetProps10() throws Exception {
		compareResourceOMO("annotations/WidgetProps10.poc");
	}

	@Test
	public void testWidgetProps11() throws Exception {
		compareResourceOMO("annotations/WidgetProps11.poc");
	}

	@Test
	public void testWidgetProps12() throws Exception {
		compareResourceOMO("annotations/WidgetProps12.poc");
	}

	@Test
	public void testWidgetProps13() throws Exception {
		compareResourceOMO("annotations/WidgetProps13.poc");
	}

	@Test
	public void testWidgetProps2() throws Exception {
		compareResourceOMO("annotations/WidgetProps2.poc");
	}

	@Test
	public void testWidgetProps3() throws Exception {
		compareResourceOMO("annotations/WidgetProps3.poc");
	}

	@Test
	public void testWidgetProps4() throws Exception {
		compareResourceOMO("annotations/WidgetProps4.poc");
	}

	@Test
	public void testWidgetProps5() throws Exception {
		compareResourceOMO("annotations/WidgetProps5.poc");
	}

	@Test
	public void testWidgetProps6() throws Exception {
		compareResourceOMO("annotations/WidgetProps6.poc");
	}

	@Test
	public void testWidgetProps7() throws Exception {
		compareResourceOMO("annotations/WidgetProps7.poc");
	}

	@Test
	public void testWidgetProps8() throws Exception {
		compareResourceOMO("annotations/WidgetProps8.poc");
	}

	@Test
	public void testWidgetProps9() throws Exception {
		compareResourceOMO("annotations/WidgetProps9.poc");
	}

	@Test
	public void testCallback() throws Exception {
		compareResourceOMO("annotations/callback.poc");
	}

	@Test
	public void testCategory() throws Exception {
		compareResourceOMO("annotations/category.poc");
	}

	@Test
	public void testInlined() throws Exception {
		compareResourceOMO("annotations/inlined.poc");
	}

}

