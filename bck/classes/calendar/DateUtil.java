package calendar;

/**
 *
 * A class configuring dates and time used within the calendar:
 * Date and time collected upon class instantiation:
 *    * for worker nodes, instantiation starts on authentication of user.
 *    * for store nodes, instantiation upon creation of store.
 *  - Assumption: Avoidance of any covert channel of a worker knowing another worker's system time,
 *                by only allowing given worker access to their own system time
 *
**/

public class DateUtil
{

}