package by.bsuir.vassabi.controller.command.common;

import by.bsuir.vassabi.controller.command.Command;
import by.bsuir.vassabi.controller.command.CommandResult;
import by.bsuir.vassabi.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartLoginCommand implements Command {

    private static final String LOGIN_PAGE = "/WEB-INF/pages/login.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
