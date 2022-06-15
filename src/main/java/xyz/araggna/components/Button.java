package xyz.araggna.components;

import com.vaadin.flow.component.html.NativeButton;
import org.springframework.stereotype.Component;

@Component
public class Button extends NativeButton {

    public Button() {
        addClassNames("mt-8 h-12 bg-[#1BBAE5] text-white rounded-lg font-bold tracking-wide scale-0 transition ease-in-out delay-1000 duration-300");
    }

    public void noScale() {
        removeClassNames("scale-0");
    }


}
