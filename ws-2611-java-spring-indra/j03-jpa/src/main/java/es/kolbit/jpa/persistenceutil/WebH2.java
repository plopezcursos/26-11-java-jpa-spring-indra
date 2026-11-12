package es.kolbit.jpa.persistenceutil;

import java.sql.SQLException;
import java.util.Scanner;

import org.h2.tools.Server;

public class WebH2 {
	public static void main(String[] args) throws SQLException {
		Server s = Server.createWebServer("-web", "-ifNotExists", "-webPort", "8082");
		s.start();
		new Scanner(System.in).nextLine();
		s.stop();
	}
}
