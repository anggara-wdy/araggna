package xyz.araggna.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import xyz.araggna.components.Card;

@Route(value = "portfolio", layout = MainLayout.class)
@PageTitle(value = "My Portfolio | Araggna")
public class PortfolioView extends FlexLayout {

    public PortfolioView() {
        addClassNames("h-screen overflow-y-auto flex flex-row");

        FlexLayout sideLayout = new FlexLayout();
        sideLayout.addClassNames("w-1/3 bg-[#B38B59]");

        FlexLayout portfolioLayout = new FlexLayout();
        portfolioLayout.addClassNames("w-2/3 py-12 px-12 flex flex-col gap-5 justify-center");

        Label titleLabel = new Label("Portfolio");
        titleLabel.addClassNames("text-5xl");

        Div containerCardDiv = new Div();
        containerCardDiv.addClassNames("grid grid-cols-3 gap-10");

        for (int i = 0; i < 3; i++) {
            containerCardDiv.add(new Card());
        }

        portfolioLayout.add(titleLabel, containerCardDiv);

        add(portfolioLayout, sideLayout);

    }
}
