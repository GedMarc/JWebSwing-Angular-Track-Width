/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angulartrackwidth;

import com.jwebmp.FileTemplates;
import com.jwebmp.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Track Width Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularTrackWidthDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularTrackWidthDirective
	 */
	public AngularTrackWidthDirective()
	{
		super("AngularTrackWidth");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularTrackWidthDirective.class, "trackWidth", "trackWidth.min.js")
		                    .toString();
	}
}