package com.corejava.pointwest.pls.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.corejava.pointwest.pls.ui.PLS_ui;

public class PLS_main {

	public static Logger log = Logger.getLogger(PLS_main.class);

	public static void main(String[] args) {
		log4j();

		PLS_ui plsui = new PLS_ui();
		plsui.loginPageUI();
	}

	public static void log4j() {
		BasicConfigurator.configure();
		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
	}
}