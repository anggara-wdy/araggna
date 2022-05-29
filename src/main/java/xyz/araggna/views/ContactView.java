package xyz.araggna.views;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "contact", layout = MainLayout.class)
@PageTitle(value = "Contact Me | Araggna")
public class ContactView extends FlexLayout {

    public ContactView() {

        addClassNames("h-screen overflow-y-auto flex flex-row");

        FlexLayout sideLayout = new FlexLayout();
        sideLayout.addClassNames("w-1/3 px-12 bg-[#B38B59] flex flex-col justify-center");

        FlexLayout formContactLayout = new FlexLayout();
        formContactLayout.addClassNames("w-2/3 py-12 px-12 flex flex-col gap-5 justify-center");

        Label titleLabel = new Label("Contact");
        titleLabel.addClassNames("text-5xl");

        TextField fullNameField = new TextField("Your name");

        EmailField emailField = new EmailField("Email");

        TextArea description = new TextArea("Description");
        description.addClassNames("h-32");

        NativeButton sendItButton = new NativeButton("Send it!");
        sendItButton.addClassNames("w-64 h-12 bg-[#B38B59] text-white shadow-lg rounded font-bold tracking-wide");

        formContactLayout.add(titleLabel, fullNameField, emailField, description, sendItButton);

        Label sideContentLabel = new Label("Thanks for your interest in Me, I hope can help You!");
        sideContentLabel.addClassNames("text-5xl text-white tracking-wider");

        sideLayout.add(sideContentLabel);

        add(formContactLayout, sideLayout);
    }
}
