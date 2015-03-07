<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div id="dlg" class="easyui-dialog" title="Toolbar and Buttons" style="width: 400px; height: 200px; padding: 10px"
	data-options="
                iconCls: 'icon-save',
                toolbar: [{
                    text:'Add',
                    iconCls:'icon-add',
                    handler:function(){
                        alert('add')
                    }
                },'-',{
                    text:'Save',
                    iconCls:'icon-save',
                    handler:function(){
                        alert('save')
                    }
                }],
                buttons: [{
                    text:'Ok',
                    iconCls:'icon-ok',
                    handler:function(){
                        alert('ok');
                    }
                },{
                    text:'Cancel',
                    handler:function(){
                        alert('cancel');;
                    }
                }]
            "
>The dialog content.</div>