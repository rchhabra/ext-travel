<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="assistedserviceutils" uri="http://hybris.com/tld/assistedserviceutils" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<spring:htmlEscape defaultHtmlEscape="true" />

<c:set var="headingData" value="${fragmentData}" scope="request"/>
<c:set var="timeSince" value="${assistedserviceutils:timeSince(headingData.signedUp)}" scope="page"/>

<div class="asm__customer360-header clearfix">
    <div class="asm__customer360-header-image">
        <c:choose>
            <c:when test="${not empty headingData.profilePicture}">
                <img src="${headingData.profilePicture.url}" class="asm__customer360-customer-image img-circle"
                     title="<spring:theme code="text.asm.customerList.picture.alt" />"/>
            </c:when>
            <c:otherwise>
                <span class="responsive-table-link default-pic"></span>
            </c:otherwise>
        </c:choose>
    </div>
    <div class="asm__customer360-header-desc">
        <div class="asm__customer360-header-name">
            <spring:theme code="text.customer360.headline" arguments="${fn:escapeXml(headingData.name)}" htmlEscape="false"/>
        </div>
        <div class="asm__customer360-header-email">
            <a href="mailto:${headingData.email}"> <c:out value="${headingData.email}"/> </a>
        </div>

        <c:if test="${not empty headingData.address}">
            <div class="asm__customer360-header-location">
                <c:if test="${not empty headingData.address.town}">
                    <spring:theme code="${headingData.address.town }" htmlEscape="true"/>
                </c:if>
                <c:if test="${not empty headingData.address.region}">
                    ,&nbsp;<spring:theme code="${headingData.address.region.name}" htmlEscape="true"/>
                </c:if>
            </div>
        </c:if>

        <div class="asm__customer360-header-info">
            <div class="asm__customer360-header-info-item">
                <span class="asm__header__cart">
                    <c:choose>
                        <c:when test="${headingData.cartSize gt 0}">
                            <spring:theme code="text.customer360.headline.cart" arguments="${headingData.cartSize}"/>&nbsp;<a href="#" class="y_asmSeeFullReservation">${fn:escapeXml(headingData.cartCode)}</a>
                        </c:when>
                        <c:otherwise>
                            <spring:theme code="text.customer360.headline.cart.empty"/>
                        </c:otherwise>
                    </c:choose>
                </span>
            </div>
            <div class="asm__customer360-header-info-item">
                <span class="asm__header__order">
                    <c:choose>
                        <c:when test="${not empty headingData.latestOrderCode}">
                            <spring:url value="/manage-booking/booking-details/${headingData.latestOrderCode}" var="link" htmlEscape="false"/>
                            <spring:theme code="text.customer360.headline.order"/>&nbsp;${fn:escapeXml(headingData.latestOrderTotal)}&nbsp;<a href="${fn:escapeXml(link)}">${fn:escapeXml(headingData.latestOrderCode)}</a>,&nbsp;
                            <fmt:formatDate value="${headingData.latestOrderTime}" pattern="dd-MM-yyyy"/>
                        </c:when>
                        <c:otherwise>
                            <spring:theme code="text.customer360.headline.order.empty"/>
                        </c:otherwise>
                    </c:choose>
                </span>
            </div>
        </div>
    </div>
    <div class="asm__customer360-signedup">
        <spring:theme code="text.customer360.summary.signedUp"/>&nbsp;<spring:theme
    		                code="text.asm.util.${timeSince}" arguments="${timeSince.value}"/>&nbsp;<spring:theme
    		                code="text.asm.util.ago"/>,&nbsp;<fmt:formatDate value="${headingData.signedUp}" pattern="dd-MM-yyyy"/>
    </div>
</div>
<div class="asm__customer360-header-sep"></div>
