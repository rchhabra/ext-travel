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
 */

package de.hybris.platform.travelservices.services;

import de.hybris.platform.travelservices.model.search.SolrIndexedTypeDefaultSortOrderMappingModel;


/**
 * This interface provides methods related to Solr Index Sorting functionality
 */
public interface SolrIndexSortService
{
	/**
	 * Gets {@link SolrIndexedTypeDefaultSortOrderMappingModel} for given indexedType
	 *
	 * @param indexedType
	 * 		the indexed type
	 * @return default sort order mapping
	 */
	SolrIndexedTypeDefaultSortOrderMappingModel getDefaultSortOrderMapping(String indexedType);
}
