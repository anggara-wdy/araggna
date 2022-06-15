package xyz.araggna.views;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import xyz.araggna.components.Button;


@Route(value = "contact", layout = MainLayout.class)
@PageTitle(value = "Contact Me | Araggna")
public class ContactView extends FlexLayout {

    public ContactView() {

        addClassNames("pt-12 pb-28 md:pb-0 md:pt-12 px-12 flex flex-col md:flex-row  justify-center items-center h-screen");

        FlexLayout formContactLayout = new FlexLayout();
        formContactLayout.addClassNames("w-full md:w-2/3 py-12 px-12 md:pl-64 flex flex-col gap-2 justify-center");

        Label titleLabel = new Label("Contact");
        titleLabel.addClassNames("text-5xl");

        TextField fullNameField = new TextField("Your name");
        fullNameField.setPlaceholder("Example: John Doe");
        fullNameField.setHelperText("Fill with your name and help to know You.");

        EmailField emailField = new EmailField("Email");
        emailField.setPlaceholder("Example: john.doe@email.co.id");
        emailField.setHelperText("Fill with your active email, I will reach You by email.");

        TextArea description = new TextArea("Description");
        description.addClassNames("h-32");
        description.setPlaceholder("How can I help You?");
        description.setHelperText("Fill and describe what do You want.");

        Button sendItButton = new Button();
        sendItButton.noScale();
        sendItButton.setText("Send it!");

        formContactLayout.add(titleLabel, fullNameField, emailField, description, sendItButton);

        FlexLayout socialMediaLayout = new FlexLayout();
        socialMediaLayout.addClassNames("w-full md:w-1/3  md:border-l-4 border-t-4 md:border-t-0 py-6 md:py-12 pl-12  flex flex-row flex-col gap-2 justify-center");

        Anchor emailAnchor = new Anchor("mailto:anggara.swan@gmail.com");
        emailAnchor.setTarget("_blank");
        emailAnchor.addClassNames("flex flex-row gap-2 items-center");

        Image emailImage = new Image("icons/mail.svg", "email");
        emailImage.addClassNames("w-8");

        Label emailLabel = new Label("anggara.swan@gmail.com");
        emailLabel.addClassNames("text-black");

        emailAnchor.add(emailImage, emailLabel);

        Anchor githubAnchor = new Anchor("https://github.com/anggara-wdy");
        githubAnchor.setTarget("_blank");
        githubAnchor.addClassNames("flex flex-row gap-2 items-center");

        Image githubImage = new Image("icons/logo-github.svg", "email");
        githubImage.addClassNames("w-8");

        Label githubLabel = new Label("anggara-wdy");
        githubLabel.addClassNames("text-black");

        githubAnchor.add(githubImage, githubLabel);

        Anchor linkedInAnchor = new Anchor("https://www.linkedin.com/in/anggarawdy/");
        linkedInAnchor.setTarget("_blank");
        linkedInAnchor.addClassNames("flex flex-row gap-2 items-center");

        Image linkedInImage = new Image("icons/logo-linkedin.svg", "email");
        linkedInImage.addClassNames("w-8");

        Label linkedInLabel = new Label("Anggara Widya");
        linkedInLabel.addClassNames("text-black");

        linkedInAnchor.add(linkedInImage, linkedInLabel);

        Anchor discordAnchor = new Anchor("https://discord.com/users/Anggara#8256");
        discordAnchor.setTarget("_blank");
        discordAnchor.addClassNames("flex flex-row gap-2 items-center");

        Image discordImage = new Image("icons/logo-discord.svg", "email");
        discordImage.addClassNames("w-8");

        Label discordLabel = new Label("Anggara#8256");
        discordLabel.addClassNames("text-black");

        discordAnchor.add(discordImage, discordLabel);

        socialMediaLayout.add(emailAnchor, githubAnchor, linkedInAnchor, discordAnchor);


        add(formContactLayout, socialMediaLayout);
    }
}
