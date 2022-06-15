package xyz.araggna.views;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.router.RouterLayout;

public class MainLayout extends Main implements RouterLayout {

    public MainLayout() {

        Header headerLayout = new Header();
        headerLayout.addClassNames("flex flex-row w-full justify-between fixed bottom-0 md:bottom-auto");

        Div logoContainerDiv = new Div();
        logoContainerDiv.addClassNames("w-0 md:w-2/3 px-12 pt-5 hidden md:flex");

        Div navContainerDiv = new Div();
        navContainerDiv.addClassNames("flex flex-row w-full md:w-1/3 items-center justify-end px-12");

        Image logo = new Image("icons/icon.png", "logo");
        logo.addClassNames("w-12");

        logoContainerDiv.add(logo);

        Nav navLayout = new Nav();
        navLayout.addClassNames("flex flex-row gap-7 items-center  md:py-0 py-5 px-5 text-white bg-[#138ea0] md:w-auto w-full h-full rounded-bl-none rounded-br-none md:rounded-bl-lg md:rounded-br-lg md:rounded-tl-none rounded-tl-lg md:rounded-tr-none rounded-tr-lg ");

        navContainerDiv.add(navLayout);

        Anchor homeAnchor = new Anchor("", "Home");
        Anchor portfolioAnchor = new Anchor("portfolio", "My Portfolio");
        Anchor aboutMeAnchor = new Anchor("resume", "My Resume");

        navLayout.add(homeAnchor, portfolioAnchor, aboutMeAnchor);

        headerLayout.add(logoContainerDiv, navContainerDiv);

        addClassNames("bg-[#FEFEFE] w-screen h-full");

        add(headerLayout);
    }
}
