package xyz.araggna.components;

import com.vaadin.flow.component.html.*;
import org.springframework.stereotype.Component;

@Component
public class Card extends Div {

    public Card() {
        addClassNames("rounded bg-[#f0f0f0] shadow-s p-5 w-full");

        Image image = new Image("images/bg-test-1.webp", "");
        image.addClassNames("w-full rounded");

        Div labelContainer = new Div();
        labelContainer.addClassNames("py-4");

        Label label = new Label("Project A");
        label.addClassNames("font-bold text-xl mb-2");

        Paragraph paragraph = new Paragraph("Description Project A BCDEFGHIJ ");
        paragraph.addClassNames("text-gray-700 text-base");

        labelContainer.add(label, paragraph);

        Div spanContainer = new Div();
        spanContainer.addClassNames("pt-4 pb-2");

        Span span1 = new Span("#java");
        span1.addClassNames("inline-block bg-[#113E21] text-white rounded-full px-3 py-1 text-sm font-semibold mr-2 mb-2");

        Span span2 = new Span("#spring-boot");
        span2.addClassNames("inline-block bg-[#113E21] text-white rounded-full px-3 py-1 text-sm font-semibold mr-2 mb-2");

        Span span3 = new Span("#PostgreSQL");
        span3.addClassNames("inline-block bg-[#113E21] text-white rounded-full px-3 py-1 text-sm font-semibold mr-2 mb-2");

        spanContainer.add(span1, span2, span3);

        add(image, labelContainer, spanContainer);
    }
}
