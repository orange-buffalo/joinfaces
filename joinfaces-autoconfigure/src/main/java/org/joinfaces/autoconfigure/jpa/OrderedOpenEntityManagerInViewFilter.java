/*
 * Copyright 2016-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.joinfaces.autoconfigure.jpa;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.web.servlet.filter.OrderedFilter;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

/**
 * {@link OrderedFilter Ordered} variant of {@link OpenEntityManagerInViewFilter}.
 *
 * @author Lars Grefer
 */
public class OrderedOpenEntityManagerInViewFilter extends OpenEntityManagerInViewFilter implements OrderedFilter {

	/**
	 * The order of this filter.
	 * <p>
	 * Before the springSecurityFilterChain and possibly {@link org.ocpsoft.rewrite.servlet.RewriteFilter}
	 */
	@Getter
	@Setter
	private int order = OrderedFilter.REQUEST_WRAPPER_FILTER_MAX_ORDER - 103;

}
