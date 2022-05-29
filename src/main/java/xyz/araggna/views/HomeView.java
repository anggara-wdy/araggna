package xyz.araggna.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle(value = "Home | Araggna")
public class HomeView extends FlexLayout {

    public HomeView() {
        addClassNames("bg-[url('images/bg-test-1.webp')] bg-cover h-screen py-12 px-12 flex flex-col justify-center items-end");

        Div containerWhiteSpaceSection = new Div();
        containerWhiteSpaceSection.addClassNames("flex flex-col w-2/3 justify-center px-12 gap-5");

        Div containerSection = new Div();
        containerSection.addClassNames("flex flex-col w-1/3 justify-center px-12 gap-5");

        Label titleLabel = new Label("Hello! I'm Anggara");
        titleLabel.addClassNames("text-5xl text-white font-bold tracking-wide");

        Label subTitleLabel = new Label("as Java Web Developer");
        subTitleLabel.addClassNames("text-3xl text-white tracking-wide");

        Label descLabelLabel = new Label("Based in Indonesia");
        descLabelLabel.addClassNames("text-white text-2xl tracking-wide");


        NativeButton contactMeButton = new NativeButton("Contact Me?", action -> getUI().ifPresent(ui -> ui.navigate("contact")));
        contactMeButton.addClassNames("mt-8 h-12 bg-[#B38B59] text-white shadow-lg rounded animate-bounce font-bold tracking-wide");

        containerSection.add(titleLabel, subTitleLabel, descLabelLabel, contactMeButton);

        add(containerWhiteSpaceSection, containerSection);

    }
}
