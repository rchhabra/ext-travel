/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *
 *
 */

package de.hybris.platform.travelservices.dao;

import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.platform.travelservices.model.AbstractOrderEntryGroupModel;

import java.util.List;


/**
 * AbstractOrderEntryGroupDao interface which provides functionality to manage AbstractOrderEntryGroup.
 */
public interface AbstractOrderEntryGroupDao extends Dao
{

	/**
	 * Return the list of AbstractOrderEntryGroups for the given abstractOrderModel
	 * 
	 * @param abstractOrderModel
	 *           as the abstractOrderModel
	 * 
	 * @return the list of AbstractOrderEntryGroups
	 */
	List<AbstractOrderEntryGroupModel> findAbstractOrderEntryGroups(AbstractOrderModel abstractOrderModel);

}
