package mvc1.servlet.web.frontcontroller.v5;

import mvc1.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import mvc1.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import mvc1.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import mvc1.servlet.web.frontcontroller.v4.controller.MemberFormControllerV4;
import mvc1.servlet.web.frontcontroller.v4.controller.MemberListControllerV4;
import mvc1.servlet.web.frontcontroller.v4.controller.MemberSaveControllerV4;
import mvc1.servlet.web.frontcontroller.v5.adapter.ControllerV3HandlerAdapter;
import mvc1.servlet.web.frontcontroller.v5.adapter.ControllerV4HandlerAdapter;

import java.util.List;
import java.util.Map;

public class HandlerConfig {

    public void handlerMappingMap(Map<String, Object> handlerMappingMap) {
        handlerMappingMap.put("/front-controller/v5/v3/members/new-form", new MemberFormControllerV3());
        handlerMappingMap.put("/front-controller/v5/v3/members/save", new MemberSaveControllerV3());
        handlerMappingMap.put("/front-controller/v5/v3/members", new MemberListControllerV3());

        // V4 추가
        handlerMappingMap.put("/front-controller/v5/v4/members/new-form", new MemberFormControllerV4());
        handlerMappingMap.put("/front-controller/v5/v4/members/save", new MemberSaveControllerV4());
        handlerMappingMap.put("/front-controller/v5/v4/members", new MemberListControllerV4());
    }

    public void handlerAdapter(List<MyHandlerAdapter> handlerAdapters) {
        handlerAdapters.add(new ControllerV3HandlerAdapter());
        handlerAdapters.add(new ControllerV4HandlerAdapter());
    }

}
