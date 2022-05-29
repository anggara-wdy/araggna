package xyz.araggna.views;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;

public class MainLayout extends Main implements RouterLayout {

    public MainLayout() {

        Header headerLayout = new Header();
        headerLayout.addClassNames("flex flex-col md:flex-row w-screen h-screen md:h-min pt-12 justify-between fixed");

        Div logoContainerDiv = new Div();
        logoContainerDiv.addClassNames("w-2/3 px-12");

        Div navContainerDiv = new Div();
        navContainerDiv.addClassNames("flex flex-row w-1/3 items-center");

        Image logo = new Image("icons/icon.png", "logo");
        logo.addClassNames("w-20 h-20");

        logoContainerDiv.add(logo);

        Nav navLayout = new Nav();
        navLayout.addClassNames("flex flex-row gap-7 items-center px-12 text-2xl text-white");

        navContainerDiv.add(navLayout);

        Anchor homeAnchor = new Anchor("", "Home");
        Anchor portfolioAnchor = new Anchor("portfolio", "My Portfolio");
        Anchor aboutMeAnchor = new Anchor("resume", "My Resume");

        navLayout.add(homeAnchor, portfolioAnchor, aboutMeAnchor);

        headerLayout.add(logoContainerDiv, navContainerDiv);

        addClassNames("bg-[#FEFEFE] w-screen");

        add(headerLayout);
    }
}
