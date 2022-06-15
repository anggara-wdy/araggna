package xyz.araggna.views;

import com.helger.commons.collection.attr.StringMap;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;

@Route(value = "resume", layout = MainLayout.class)
@PageTitle(value = "My Resume | Araggna")
public class ResumeView extends FlexLayout {

    public ResumeView() {

        addClassNames("overflow-y-auto flex flex-col md:flex-row h-screen pb-12 md:pb-0");

        FlexLayout sideLayout = new FlexLayout();
        sideLayout.addClassNames("w-full md:w-1/3 py-12 px-12 flex flex-col gap-5 justify-center");

        FlexLayout contentLayout = new FlexLayout();
        contentLayout.addClassNames("w-full md:w-2/3 py-12 px-12 flex flex-col gap-7 justify-center");

        Label titleLabel = new Label("Resume");
        titleLabel.addClassNames("text-5xl");

        Div resumeContentDiv = new Div();
        resumeContentDiv.addClassNames("flex flex-col md:flex-row gap-5 items-start");

        Div pictureAboutMeLayout = new Div();
        pictureAboutMeLayout.addClassNames("flex flex-col md:w-3/12 w-full justify-center");

        Image image = new Image("images/profile.jpeg", "");
        image.addClassNames("w-1/2 md:w-full");
        image.addClassNames("rounded");

        Div labelContainer = new Div();
        labelContainer.addClassNames("py-4 flex flex-col md:items-center");

        Label label = new Label("Anggara W.");
        label.addClassNames("font-bold text-xl mb-2");

        Paragraph paragraph = new Paragraph("Java Web Developer");
        paragraph.addClassNames("text-gray-700 text-base");

        labelContainer.add(label, paragraph);

        pictureAboutMeLayout.add(image, labelContainer);

        FlexLayout aboutMeLayout = new FlexLayout();
        aboutMeLayout.addClassNames("flex w-full md:w-9/12 pl-0 md:pl-5 flex-col");


        Label subTitleAboutMe = new Label("About me");
        subTitleAboutMe.addClassNames("text-3xl");

        Paragraph descriptionParagraph = new Paragraph(
                "Hello, my name is Anggara, I'm currently based in Batu, Indonesia. \n" +
                    "I've been working as Web Developer 6 years in many type of company and programing language. \n"

        );

        Paragraph descriptionParagraph2 = new Paragraph(
                "My skill develop web using many language and framework. I'm familiar using Java language and using Vaadin Framework for frontend and Spring Boot for backend. \n" +
                    "In my experience usually using database PostgreSQL, MySQL and MSSQL. And I also know basic to deploy web app to cloud like alibaba, google cloud, aws etc. \n"

        );

        Paragraph descriptionParagraph3 = new Paragraph(
                "My last recent job at Mowilex Indonesia as Software Engineer. My job description develop employee KPI System, Catalog website, and build dashboard using Power BI "
        );

        descriptionParagraph.addClassNames("tracking-wide font-thin pt-2 text-slate-700 pb-2");
        descriptionParagraph2.addClassNames("tracking-wide font-thin pt-2 text-slate-700 pb-2");
        descriptionParagraph3.addClassNames("tracking-wide font-thin pt-2 text-slate-700");

        aboutMeLayout.add(subTitleAboutMe, descriptionParagraph, descriptionParagraph2, descriptionParagraph3);
        resumeContentDiv.add(pictureAboutMeLayout, aboutMeLayout);
        contentLayout.add(titleLabel, resumeContentDiv);

        /* Side Layout */

        Label subTitleExperience = new Label("My Work Experience");
        subTitleExperience.addClassNames("text-3xl");

        sideLayout.add(subTitleExperience);

        Accordion accordion = new Accordion();

        AccordionPanel accordionPanel1 = accordion.add("Java Software Engineer", cardSoftwareEngineerExperience());
        accordionPanel1.addClassNames("font-bold text-2xl");

        AccordionPanel accordionPanel2 = accordion.add("Data Engineer", cardDataEngineerExperience());
        accordionPanel2.addClassNames("font-bold text-2xl");

        AccordionPanel accordionPanel3 = accordion.add("PHP Software Engineer", cardPHPSoftwareEngineerExperience());
        accordionPanel3.addClassNames("font-bold text-2xl");

        sideLayout.add(accordion);
 
        add(contentLayout, sideLayout);

    }

    private Component cardSoftwareEngineerExperience() {
        Div cardExperienceDiv = new Div();
        cardExperienceDiv.addClassNames("flex flex-col bg-[#f0f0f0] p-5 gap-3 rounded");

        Div cardExperienceHeadDiv = new Div();
        cardExperienceHeadDiv.addClassNames("flex flex-col gap-2");

        Label titleLabel = new Label("Java Software Engineer");
        titleLabel.addClassNames("font-bold text-2xl");

        Label subtitleLabel = new Label("Mowilex Indonesia (2020-2022)");
        subtitleLabel.addClassNames("font-bold");

        UnorderedList unorderedList = new UnorderedList();
        unorderedList.addClassNames("font-thin list-disc pl-5");

        unorderedList.add(
                new ListItem("Designing and implementing java applications, developing and testing software and resolving technical issues that arise."),
                new ListItem("Proficient with coding in Java with Vaadin Framework as Frontend, Spring JPA as Backend, and Spring Security.")
        );

        cardExperienceHeadDiv.add(subtitleLabel, unorderedList);

        cardExperienceDiv.add(cardExperienceHeadDiv);

        return cardExperienceDiv;
    }

    private Component cardDataEngineerExperience() {
        Div cardExperienceDiv = new Div();
        cardExperienceDiv.addClassNames("flex flex-col bg-[#f0f0f0] p-5 gap-3 rounded");

        Div cardExperienceHeadDiv = new Div();
        cardExperienceHeadDiv.addClassNames("flex flex-col gap-2");

        Label titleLabel = new Label("Data Engineer");
        titleLabel.addClassNames("font-bold text-2xl");

        Label subtitleLabel = new Label("Mowilex Indonesia (2020-2022)");
        subtitleLabel.addClassNames("font-bold");

        UnorderedList unorderedList = new UnorderedList();
        unorderedList.addClassNames("font-thin list-disc pl-5");

        unorderedList.add(
                new ListItem("Develop Dashboard, and ETL existing data using Power BI."),
                new ListItem("Analyze user need and design dashboard.")
        );

        cardExperienceHeadDiv.add(subtitleLabel, unorderedList);

        cardExperienceDiv.add(cardExperienceHeadDiv);

        return cardExperienceDiv;
    }

    private Component cardPHPSoftwareEngineerExperience() {
        Div cardExperienceDiv = new Div();
        cardExperienceDiv.addClassNames("flex flex-col bg-[#f0f0f0] p-5 gap-3 rounded");

        Div cardExperienceHeadDiv = new Div();
        cardExperienceHeadDiv.addClassNames("flex flex-col gap-2");

        Label titleLabel = new Label("PHP Software Engineer");
        titleLabel.addClassNames("font-bold text-2xl");

        Label subtitleLabel = new Label("Hyperdata Solusindo Mandiri (2017-2020)");
        subtitleLabel.addClassNames("font-bold");

        Label subtitleLabel2 = new Label("Girisa Teknologi (2015-2016)");
        subtitleLabel2.addClassNames("font-bold");

        UnorderedList unorderedList = new UnorderedList();
        unorderedList.addClassNames("font-thin list-disc pl-5");

        unorderedList.add(
                new ListItem("Proficient with coding in PHP using Code Igniter Framework, and also PHP Native with frontend tools jQuery")
        );

        cardExperienceHeadDiv.add(subtitleLabel, subtitleLabel2, unorderedList);

        cardExperienceDiv.add(cardExperienceHeadDiv);
        return cardExperienceDiv;
    }
}
