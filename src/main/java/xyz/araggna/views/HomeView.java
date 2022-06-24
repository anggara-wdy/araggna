package xyz.araggna.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.shared.ui.LoadMode;
import xyz.araggna.components.Button;

import java.util.concurrent.TimeUnit;

@Route(value = "", layout = MainLayout.class)
@PageTitle(value = "Home | Araggna")
public class HomeView extends FlexLayout implements AfterNavigationObserver {

    private Label titleLabel;
    private Label subTitleLabel;
    private Label descLabelLabel;
    private Button contactMeButton;

    public HomeView() {
        addClassNames("py-12 px-12 flex flex-row justify-center h-full");

        Div containerWhiteSpaceSection = new Div();
        containerWhiteSpaceSection.addClassNames("hidden md:flex md:flex-col md:w-1/2  justify-center items-center px-5 gap-5");

        Div containerBubbleBlurSection = new Div();
        containerBubbleBlurSection.addClassNames("relative w-full max-w-lg");

        Div bubbleBlurPurpleDiv = new Div();
        bubbleBlurPurpleDiv.addClassNames("absolute top-0 -left-4 w-72 h-72 bg-[#1ac0c6] rounded-full mix-blend-multiply filter blur-xl opacity-70 animate-blob");

        Div bubbleBlurYellowDiv = new Div();
        bubbleBlurYellowDiv.addClassNames("absolute top-0 -right-4 w-72 h-72 bg-[#e74645] rounded-full mix-blend-multiply filter blur-xl opacity-70 animate-blob animation-delay-2000");

        Div bubbleBlurPinkDiv = new Div();
        bubbleBlurPinkDiv.addClassNames("absolute -bottom-8 left-20 w-72 h-72 bg-[#ffc14d] rounded-full mix-blend-multiply filter blur-xl opacity-70 animate-blob animation-delay-4000");

        containerBubbleBlurSection.add(bubbleBlurPurpleDiv, bubbleBlurYellowDiv, bubbleBlurPinkDiv);

        containerWhiteSpaceSection.add(containerBubbleBlurSection);

        Div containerSection = new Div();
        containerSection.addClassNames("flex flex-col md:w-1/2 w-full justify-center md:pl-48 gap-5");

        titleLabel = new Label("Hello! I'm Anggara");
        titleLabel.setId("label-name");
        titleLabel.addClassNames("text-5xl font-bold tracking-wide scale-0 transition ease-in-out delay-300 duration-300");

        subTitleLabel = new Label("as Java Web Developer");
        subTitleLabel.setId("label-title");
        subTitleLabel.addClassNames("text-3xl tracking-wide scale-0 transition ease-in-out delay-500 duration-300");

        descLabelLabel = new Label("Based in Indonesia");
        descLabelLabel.setId("label-location");
        descLabelLabel.addClassNames("text-2xl tracking-wide scale-0 transition ease-in-out delay-700 duration-300");

        contactMeButton = new Button();
        contactMeButton.setText("Contact Me?");
        contactMeButton.setId("button-contact-me");
        contactMeButton.addClickListener(action -> getUI().ifPresent(ui -> ui.navigate("contact")));

        containerSection.add(titleLabel, subTitleLabel, descLabelLabel, contactMeButton);

        add(containerWhiteSpaceSection, containerSection);
    }

    @Override
    public void afterNavigation(AfterNavigationEvent afterNavigationEvent) {

        titleLabel.removeClassNames("scale-0");
        subTitleLabel.removeClassNames("scale-0");
        descLabelLabel.removeClassNames("scale-0");
        contactMeButton.removeClassNames("scale-0");

    }
}
