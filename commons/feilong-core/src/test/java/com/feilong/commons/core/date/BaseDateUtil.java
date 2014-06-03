/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.commons.core.date;

import java.util.Date;

/**
 * 
 * @author <a href="mailto:venusdrogon@163.com">feilong</a>
 * @version 1.0.7 2014年6月3日 下午11:37:43
 * @since 1.0.7
 */
public abstract class BaseDateUtil{

	/** <code>{@value}</code> code. */
	public static String	fromString			= "2011-03-5 23:31:25.456";

	/** The to string. */
	public static String	toString			= "2011-03-10 01:30:24.895";

	/** The now. */
	public static Date		now					= new Date();

	/** The current year begin. */
	public static Date		currentYearBegin	= DateUtil.getFirstDateOfThisYear(now);

	/** The current year end. */
	public static Date		currentYearEnd		= DateUtil.getLastDateOfThisYear(now);

	/** The current year end. */
	public static Date		testDate			= DateUtil.string2Date("2014-12-31 01:30:24.895", DatePattern.commonWithMillisecond);
}
