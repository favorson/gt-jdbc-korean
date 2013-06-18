/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.data.altibase;

import java.util.Map;

import org.geotools.jdbc.JDBCJNDIDataStoreFactory;

@SuppressWarnings("unchecked")
public class AltibaseNGJNDIDataStoreFactory extends JDBCJNDIDataStoreFactory {

    public AltibaseNGJNDIDataStoreFactory() {
        super(new AltibaseNGDataStoreFactory());
    }

    @Override
    @SuppressWarnings("rawtypes")
    protected void setupParameters(Map parameters) {
        super.setupParameters(parameters);

        parameters.put(AltibaseNGDataStoreFactory.LOOSEBBOX.key,
                AltibaseNGDataStoreFactory.LOOSEBBOX);
        parameters.put(AltibaseNGDataStoreFactory.PREPARED_STATEMENTS.key,
                AltibaseNGDataStoreFactory.PREPARED_STATEMENTS);
        parameters.put(MAX_OPEN_PREPARED_STATEMENTS.key, MAX_OPEN_PREPARED_STATEMENTS);
    }
}
