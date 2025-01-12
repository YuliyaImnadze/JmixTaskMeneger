package com.company.jmixtaskmeneger.view.assignee;

import com.company.jmixtaskmeneger.entity.Assignee;
import com.company.jmixtaskmeneger.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "assignees/:id", layout = MainView.class)
@ViewController(id = "Assignee.detail")
@ViewDescriptor(path = "assignee-detail-view.xml")
@EditedEntityContainer("assigneeDc")
public class AssigneeDetailView extends StandardDetailView<Assignee> {
}