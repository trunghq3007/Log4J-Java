/**
 * 
 */
package main;

import org.apache.log4j.Logger;

/**
 * @description:
 * @author: Admin
 * @time: 4:13:54 PM
 * @date: Apr 9, 2018
 */
public class main {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(main.class);

	public static void main(String[] args) {

		log.info("Hello this is an info message");
		log.error("error need fix");
		log.debug("Hello this is a debug message");
	}
}
