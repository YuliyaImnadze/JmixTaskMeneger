package com.company.jmixtaskmeneger.view.assignee;

import com.company.jmixtaskmeneger.entity.Assignee;
import com.company.jmixtaskmeneger.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "assignees", layout = MainView.class)
@ViewController(id = "Assignee.list")
@ViewDescriptor(path = "assignee-list-view.xml")
@LookupComponent("assigneesDataGrid")
@DialogMode(width = "64em")
public class AssigneeListView extends StandardListView<Assignee> {
}