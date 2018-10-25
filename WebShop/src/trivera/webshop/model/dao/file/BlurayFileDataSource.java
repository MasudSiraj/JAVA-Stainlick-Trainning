package trivera.webshop.model.dao.file;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import trivera.webshop.model.Bluray;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2018 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */

public class BlurayFileDataSource {
	private static BlurayFileDataSource currentInstance;
	private List<Bluray> blurayData = new ArrayList<>();

	private BlurayFileDataSource() {
	};

	/**
	 * Create a single instance of this File DataSource
	 * 
	 * @return the current instance
	 */
	public static BlurayFileDataSource getInstance() {
		if (currentInstance == null) {
			currentInstance = new BlurayFileDataSource();
			currentInstance.readDataFile();
		}
		return currentInstance;
	}

	public List<Bluray> getAllBlurays() {
		return blurayData;
	}

	/**
	 * Read the data file into memory
	 */
	private void readDataFile() {

		try (InputStream inputStream = BlurayFileDataSource.class
				.getClassLoader().getResourceAsStream(
						"trivera/webshop/model/dao/file/Bluray.data");
				Scanner sc = new Scanner(inputStream, "UTF-8");) {

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				blurayData.add(createObject(line));
			}

		} catch (IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

	/**
	 * Split the semi-colon string value into individual fields
	 * 
	 * @param data
	 *            a single line of data
	 * @return a Bluray instance
	 */
	private Bluray createObject(String data) {
		String[] fields = data.split(";");
		Bluray bluray = new Bluray();

		bluray.setId(fields[0]);
		bluray.setTitle(fields[1]);
		bluray.setStudio(fields[2]);
		bluray.setPrice(Double.parseDouble(fields[3]));
		bluray.setRating(fields[4]);
		bluray.setGenre(fields[5]);

		return bluray;
	}
}
