<%@page language="java"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.inquiry.list.label.title" path="title"/>
	<jstl:if test="${command != 'create'}">
	<acme:form-moment code="administrator.inquiry.list.label.creation" path="creation" readonly="true"/>
	</jstl:if>
	<acme:form-moment code="administrator.inquiry.list.label.deadline" path="deadline"/>
	<acme:form-textarea code="administrator.inquiry.list.label.description" path="description"/>
	<acme:form-textbox code="administrator.inquiry.list.label.email" path="email"/>
	<acme:form-money code="administrator.inquiry.list.label.minMoney" path="minMoney"/>
	<acme:form-money code="administrator.inquiry.list.label.maxMoney" path="maxMoney"/>
	
	<acme:form-submit test ="${command == 'show'}"
		code="administrator.inquiry.form.button.update"
		action="/administrator/inquiry/update"/>
	<acme:form-submit test ="${command == 'show'}"
		code="administrator.inquiry.form.button.delete"
		action="/administrator/inquiry/delete"/>
	<acme:form-submit test ="${command == 'create'}"
		code="administrator.inquiry.form.button.create"
		action="/administrator/inquiry/create"/>
	<acme:form-submit test ="${command == 'update'}"
		code="administrator.inquiry.form.button.update"
		action="/administrator/inquiry/update"/>
	<acme:form-submit test ="${command == 'delete'}"
		code="administrator.inquiry.form.button.delete"
		action="/administrator/inquiry/delete"/>
	
	<acme:form-return code="administrator.inquiry.button.return"/>
</acme:form>