/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.freemarker;

import com.liferay.portal.kernel.template.TemplateException;
import com.liferay.portal.kernel.template.TemplateManager;
import com.liferay.portal.template.BaseTemplateResourceLoader;
import com.liferay.portal.util.PropsValues;

/**
 * @author Tina Tian
 */
public class FreeMarkerTemplateResourceLoader
	extends BaseTemplateResourceLoader {

	public String getTemplateResourceLoaderName() {
		return TemplateManager.FREEMARKER;
	}

	@Override
	public void init() throws TemplateException {
		interval = PropsValues.FREEMARKER_ENGINE_MODIFICATION_CHECK_INTERVAL;

		if (interval > 0) {
			checkInterval = true;
		}

		initTemplateResourceParsers(
			PropsValues.FREEMARKER_ENGINE_TEMPLATE_LOADERS);
	}

}