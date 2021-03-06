// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._DaysOfWeekSelector;
import ms.sql.reporting.reportingservices._MonthlyDOWRecurrence;
import ms.sql.reporting.reportingservices._MonthsOfYearSelector;
import ms.sql.reporting.reportingservices._WeekNumberEnum;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _MonthlyDOWRecurrence
    extends _RecurrencePattern
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _WeekNumberEnum whichWeek;
    protected _DaysOfWeekSelector daysOfWeek;
    protected _MonthsOfYearSelector monthsOfYear;

    public _MonthlyDOWRecurrence()
    {
        super();
    }

    public _MonthlyDOWRecurrence(
        final _WeekNumberEnum whichWeek,
        final _DaysOfWeekSelector daysOfWeek,
        final _MonthsOfYearSelector monthsOfYear)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWhichWeek(whichWeek);
        setDaysOfWeek(daysOfWeek);
        setMonthsOfYear(monthsOfYear);
    }

    public _WeekNumberEnum getWhichWeek()
    {
        return this.whichWeek;
    }

    public void setWhichWeek(_WeekNumberEnum value)
    {
        this.whichWeek = value;
    }

    public _DaysOfWeekSelector getDaysOfWeek()
    {
        return this.daysOfWeek;
    }

    public void setDaysOfWeek(_DaysOfWeekSelector value)
    {
        this.daysOfWeek = value;
    }

    public _MonthsOfYearSelector getMonthsOfYear()
    {
        return this.monthsOfYear;
    }

    public void setMonthsOfYear(_MonthsOfYearSelector value)
    {
        this.monthsOfYear = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Declare our type
        writer.writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "MonthlyDOWRecurrence");

        // Elements
        if (this.whichWeek != null)
        {
            this.whichWeek.writeAsElement(
                writer,
                "WhichWeek");
        }

        if (this.daysOfWeek != null)
        {
            this.daysOfWeek.writeAsElement(
                writer,
                "DaysOfWeek");
        }

        if (this.monthsOfYear != null)
        {
            this.monthsOfYear.writeAsElement(
                writer,
                "MonthsOfYear");
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("WhichWeek"))
                {
                    this.whichWeek = _WeekNumberEnum.fromString(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("DaysOfWeek"))
                {
                    this.daysOfWeek = new _DaysOfWeekSelector();
                    this.daysOfWeek.readFromElement(reader);
                }
                else if (localName.equalsIgnoreCase("MonthsOfYear"))
                {
                    this.monthsOfYear = new _MonthsOfYearSelector();
                    this.monthsOfYear.readFromElement(reader);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
