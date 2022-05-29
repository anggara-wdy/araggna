package xyz.araggna.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "resume", layout = MainLayout.class)
@PageTitle(value = "My Resume | Araggna")
public class ResumeView extends FlexLayout {

    public ResumeView() {

        addClassNames("h-screen overflow-y-auto flex flex-row");

        FlexLayout sideLayout = new FlexLayout();
        sideLayout.addClassNames("w-1/3 bg-[#B38B59] px-12 flex flex-col gap-5 justify-center");

        FlexLayout contentLayout = new FlexLayout();
        contentLayout.addClassNames("w-2/3 py-12 px-12 flex flex-col gap-7 justify-center");

        Label titleLabel = new Label("Resume");
        titleLabel.addClassNames("text-5xl");

        Div resumeContentDiv = new Div();
        resumeContentDiv.addClassNames("flex flex-row gap-5 items-start");

        Div pictureAboutMeLayout = new Div();
        pictureAboutMeLayout.addClassNames("flex flex-col border-r border-slate-700 w-3/12 w-full pr-12");

        Image image = new Image("images/about-me.JPG", "");
        image.addClassNames("rounded");

        Div labelContainer = new Div();
        labelContainer.addClassNames("py-4 flex flex-col items-center");

        Label label = new Label("Anggara W.");
        label.addClassNames("font-bold text-xl mb-2");

        Paragraph paragraph = new Paragraph("Java Web Developer");
        paragraph.addClassNames("text-gray-700 text-base");

        labelContainer.add(label, paragraph);

        pictureAboutMeLayout.add(image, labelContainer);

        FlexLayout aboutMeLayout = new FlexLayout();
        aboutMeLayout.addClassNames("flex w-9/12 pl-l flex-col");


        Label subTitleAboutMe = new Label("About me");
        subTitleAboutMe.addClassNames("text-3xl");

        Paragraph descriptionParagraph = new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis molestie velit. Sed lacus est, dictum eu lobortis sit amet, sodales sit amet quam. Morbi congue finibus viverra. Duis auctor hendrerit pellentesque. Suspendisse potenti. Aliquam tincidunt tincidunt mauris, non hendrerit lorem finibus nec. Donec gravida nulla lacus, sit amet tempor leo maximus in.\n" +
                "\n" +
                "Nunc venenatis nibh eu orci consectetur tincidunt. Quisque et eros blandit, dictum metus efficitur, finibus tortor. In congue velit quis commodo eleifend. In volutpat posuere varius. Maecenas a tortor turpis. Proin vitae risus vel lectus ultricies dapibus eu at ligula. Nullam pharetra velit vehicula, bibendum arcu id, tempor metus. Duis ac arcu metus. Nam hendrerit justo non tellus sagittis laoreet. Aliquam quis accumsan erat. Sed sit amet mi eget arcu porttitor rutrum. Suspendisse quis sagittis mi.\n" +
                "\n" +
                "Donec ac nulla nunc. In a orci odio. Cras rutrum vitae eros aliquet efficitur. Morbi tincidunt elementum aliquam. In lacinia ut metus sed condimentum. Quisque sed condimentum elit, vel fringilla quam. In rutrum, lacus at sollicitudin pellentesque, ante neque accumsan mauris, a vulputate tortor quam a dolor.\n" +
                "\n");
        descriptionParagraph.addClassNames("tracking-wide font-extralight pt-2 text-slate-700");

        aboutMeLayout.add(subTitleAboutMe, descriptionParagraph);
        resumeContentDiv.add(pictureAboutMeLayout, aboutMeLayout);
        contentLayout.add(titleLabel, resumeContentDiv);

        /* Side Layout */

        Label subTitleExperience = new Label("My Work Experience");
        subTitleExperience.addClassNames("text-3xl text-white");

        sideLayout.add(subTitleExperience);

        sideLayout.add(cardExperience("PHP Web Developer,", "2017 - 2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis molestie velit. Sed lacus est, dictum eu lobortis sit amet, sodales sit amet quam. Morbi congue finibus viverra."));
        sideLayout.add(cardExperience("Java Web Developer,", "2019 - 2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis molestie velit. Sed lacus est, dictum eu lobortis sit amet, sodales sit amet quam. Morbi congue finibus viverra."));
        sideLayout.add(cardExperience("Java Web Developer,", "2020 - 2022", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis molestie velit. Sed lacus est, dictum eu lobortis sit amet, sodales sit amet quam. Morbi congue finibus viverra."));

        add(contentLayout, sideLayout);

    }

    private Component cardExperience(String title, String years, String descriptions) {
        Div cardExperienceDiv = new Div();
        cardExperienceDiv.addClassNames("flex flex-col bg-[#f0f0f0] p-5 gap-3 rounded shadow-lg");

        Div cardExperienceHeadDiv = new Div();
        cardExperienceHeadDiv.addClassNames("flex flex-row gap-2 items-end");

        Label titleLabel = new Label(title);
        titleLabel.addClassNames("font-bold text-l");

        Span span = new Span(years);
        span.addClassNames("text-slate-600");

        cardExperienceHeadDiv.add(titleLabel, span);

        Div cardExperienceContentDiv = new Div();
        cardExperienceContentDiv.addClassNames("flex flex-col");

        Paragraph paragraph = new Paragraph(descriptions);
        paragraph.addClassNames("tracking-wide font-extralight text-slate-700");

        cardExperienceContentDiv.add(paragraph);

        cardExperienceDiv.add(cardExperienceHeadDiv, cardExperienceContentDiv);

        return cardExperienceDiv;
    }
}
