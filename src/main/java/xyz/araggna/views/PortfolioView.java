package xyz.araggna.views;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import xyz.araggna.components.Button;

@Route(value = "portfolio", layout = MainLayout.class)
@PageTitle(value = "My Portfolio | Araggna")
public class PortfolioView extends FlexLayout {

    public PortfolioView() {
        addClassNames("overflow-y-auto flex flex-row");

        FlexLayout portfolioLayout = new FlexLayout();
        portfolioLayout.addClassNames("w-full md:mt-0 py-12 px-12 md:px-64 flex flex-col gap-5 justify-center ");

        Label titleLabel = new Label("Portfolio");
        titleLabel.addClassNames("text-5xl");

        FlexLayout rowLayout = new FlexLayout();
        rowLayout.addClassNames("md:flex-row flex-col gap-5");

        FlexLayout rowContainerPortfolio1 = new FlexLayout();
        rowContainerPortfolio1.addClassNames("flex-row md:w-2/3 w-full");

        FlexLayout rowContainerPortfolio2and3 = new FlexLayout();
        rowContainerPortfolio2and3.addClassNames("flex-col w-full md:w-1/3 gap-5");

        Div portfolioCard1 = new Div();
        portfolioCard1.addClassNames("rounded flex flex-col gap-3 bg-[#f0f0f0] p-5");

        Image image1 = new Image("images/portfolio/cendanapaints-cover.png", "");
        image1.addClassNames("w-full rounded-lg");

        Label title1 = new Label("Cendanapaints Website");
        title1.addClassNames("text-2xl font-bold");

        Paragraph paragraph1 = new Paragraph(
                "Building catalog product website using lit framework as frontend, with bootstrap as css framework. I built this website from a mockup made by the design team"
        );

        Button detailsButton = new Button();
        detailsButton.setText("See detail here");
        detailsButton.noScale();
        detailsButton.removeClassNames("bg-[#1BBAE5] text-white mt-8");
        detailsButton.addClassNames("md:w-1/3 w-1/2 outline outline-[#1BBAE5] outline-offset-0 outline-2 text-[#1BBAE5]");

        detailsButton.addClickListener(event -> {
            Dialog dialog = new Dialog();
            dialog.setId("dialog");
            dialog.setWidth("90%");
            dialog.setHeightFull();
            dialog.setCloseOnEsc(true);
            dialog.setCloseOnOutsideClick(true);


            FlexLayout modalContentLayout = new FlexLayout();
            modalContentLayout.addClassNames("flex flex-col gap-3 pb-12 md:px-24");

            Label title = new Label("Cendanapaints Website");
            title.addClassNames("text-3xl mb-5");

            Image coverImage = new Image("images/portfolio/cendanapaints-cover.png", "cover image");

            Paragraph paragraph = new Paragraph("Building catalog product website using lit framework as frontend, with bootstrap as css framework. I built this website from a mockup made by the design team. I got this project while I'm working on Mowilex Indonesia.");

            Image imageProductPage = new Image("images/portfolio/cendanapaints-product.png", "preview-product");

            Paragraph paragraph2 = new Paragraph("The challenge to build this simple visualizer in product page. I'm using simple logic in javascript, using background-blend css native and need svg tag to build shape like wall.");

            Anchor anchor = new Anchor("https://cendanapaints.com", "Link to website");
            anchor.setTarget(AnchorTarget.BLANK);
            anchor.addClassNames("text-[#1BBAE5]");

            modalContentLayout.add(title, coverImage, paragraph, imageProductPage, paragraph2, anchor);

            dialog.add(modalContentLayout);
            dialog.open();
        });

        portfolioCard1.add(image1, title1, paragraph1, detailsButton);

        Div portfolioCard2 = new Div();
        portfolioCard2.addClassNames("flex flex-col gap-2 rounded col-span-1 bg-[#f0f0f0] p-5");

        Image image2 = new Image("images/portfolio/EPAS.png", "");
        image2.addClassNames("w-full rounded-lg");

        Label title2 = new Label("Employee Performance Appraisal System");
        title2.addClassNames("text-l font-bold");

        Button detailsButton2 = new Button();
        detailsButton2.setText("See detail here");
        detailsButton2.noScale();
        detailsButton2.removeClassNames("bg-[#1BBAE5] text-white mt-8");
        detailsButton2.addClassNames("md:w-1/2 w-1/2 outline outline-[#1BBAE5] outline-offset-0 outline-2 text-[#1BBAE5]");
        detailsButton2.addClickListener(event -> {
            Dialog dialog = new Dialog();
            dialog.setId("dialog");
            dialog.setWidth("90%");
            dialog.setHeightFull();
            dialog.setCloseOnEsc(true);
            dialog.setCloseOnOutsideClick(true);

            FlexLayout modalContentLayout = new FlexLayout();
            modalContentLayout.addClassNames("flex flex-col gap-3 pb-12 md:px-24");

            Label title = new Label("Employee Performance Appraisal System");
            title.addClassNames("text-3xl mb-5");

            Image coverImage = new Image("images/portfolio/EPAS.png", "cover image");

            Paragraph paragraph = new Paragraph("Building webapp for appraisal system in Mowilex Indonesia by using Vaadin Framework as Frontend and Spring Framework as Backend. This work is in collaboration with Human Capital or Human Resource Division for measure appraisal employee. The challenge built this webapp have feature approval level and every employee must use this application, because of that I'm also implemented PWA (Progressive Web Apps) make user can installing in their phone");

            modalContentLayout.add(title, coverImage, paragraph);

            dialog.add(modalContentLayout);
            dialog.open();
        });

        portfolioCard2.add(image2, title2, detailsButton2);

        Div portfolioCard3 = new Div();
        portfolioCard3.addClassNames("flex flex-col gap-2 rounded col-span-1 bg-[#f0f0f0] p-5");

        Image image3 = new Image("images/portfolio-1.png", "");
        image3.addClassNames("w-full rounded-lg");

        Label title3 = new Label("Sales Dashboard using Power BI");
        title3.addClassNames("text-l font-bold");

        Button detailsButton3 = new Button();
        detailsButton3.setText("See detail here");
        detailsButton3.noScale();
        detailsButton3.removeClassNames("bg-[#1BBAE5] text-white mt-8");
        detailsButton3.addClassNames("md:w-1/2 w-1/2 outline outline-[#1BBAE5] outline-offset-0 outline-2 text-[#1BBAE5]");
        detailsButton3.addClickListener(event -> {
            Dialog dialog = new Dialog();
            dialog.setId("dialog");
            dialog.setWidth("90%");
            dialog.setHeightFull();
            dialog.setCloseOnEsc(true);
            dialog.setCloseOnOutsideClick(true);

            FlexLayout modalContentLayout = new FlexLayout();
            modalContentLayout.addClassNames("flex flex-col gap-3 pb-12 md:px-24");

            Label title = new Label("Sales Dashboard using Power BI");
            title.addClassNames("text-3xl mb-5");

            Image coverImage = new Image("images/portfolio-1.png", "cover image");

            Paragraph paragraph = new Paragraph("Building Sales Dashboard using Power BI, also cleansing, transform data from many resource (Database, Spreadsheet, APIs, etc) into Power BI Dashboard. Many processes only using tools Power BI and little query and store procedure. Dashboard have security filter data portion by level, example General Manager can see all data, but Regional Manager only see their regional data");

            modalContentLayout.add(title, coverImage, paragraph);

            dialog.add(modalContentLayout);
            dialog.open();
        });

        portfolioCard3.add(image3, title3, detailsButton3);

        rowContainerPortfolio1.add(portfolioCard1);
        rowContainerPortfolio2and3.add(portfolioCard2, portfolioCard3);
        rowLayout.add(rowContainerPortfolio1, rowContainerPortfolio2and3);

        portfolioLayout.add(titleLabel, rowLayout);


        add(portfolioLayout);

    }


}
