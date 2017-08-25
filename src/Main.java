import java.util.Arrays;

/**
 * Application single entry point class.
 * 
 * @author Todor Balabanov
 */
public class Main {

	/**
	 * Application single entry point method.
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("START");

		Reel second = new Reel(new String[] {

				"llll", "ppzs", "llss", "ppzs", "cggg", "ppll", "gppp", "ppll", "cddd", "pppc", "cccc", "ppzs", "dlll",
				"ccgg", "cccg", "pppp", "dddd", "pzcc", "llll", "ppzc", "cccg", "ddll", "ppss", "cccg", "cddd", "pppz",
				"cccd", "cccg", "gggd", "llld", "cccc", "cccc", "lllp", "7777", "ggdd", "pzcc", "cddd", "pppp", "ccgg",
				"lddd", "gggg", "lllp", "ddd7", "ddss", "zppp", "ggdd", "ddss", "cggg", "pppp", "dddd", "ddds", "pppz",
				"sspp", "gppp", "pzss", "pppz", "pppd", "sssl", "sppp", "ccdd", "dzpp", "lllp", "cddd", "ppps", "dddl",
				"ggpp", "gggg", "llll", "cccc", "cccc", "pppp", "pzss", "cccc", "pzss", "dsss", "ppzs", "dddd", "cccg",
				"ssss", "sssl", "pppc", "ppcc", "gggg", "dddd", "ggpp", "gggp", "ppll", "pzcc", "gggg", "llll", "dd77",
				"7777", "cddd", "llpp", "cddd", "cddd", "lllc", "lppp", "sccc", "ddds", "ggpp", "pzcc", "d777", "77ll",
				"gppp", "pppp", "ccgg", "zccc", "llll", "gggp", "sppp", "pppp", "ppzc", "pppz", "ppzs", "ppzs", "llpp",
				"gggp", "gggp", "ddss", "cccg", "ccgg", "pppp", "ccgg", "zsss", "7lll", "ddss", "lddd", "pppp", "zccc",
				"pppp", "lddd", "pppp", "ddd7", "gppp", "dddl", "ppcc", "cccg", "lddd", "cccg", "dddl", "cccc", "llpp",
				"pppp", "psss", "plll", "ddll", "lccc", "gggg", "ccgg", "zccc", "dlll", "pccc", "llcc", "ppss", "ssll",
				"pppc", "gppp", "llld", "pzss", "sscc", "lccc", "llll", "ddll", "lppp", "pccc", "ccgg", "pppz", "ccgg",
				"sspp", "ssss", "psss", "cccc", "gddd", "ccdd", "cccc", "dddl", "llll", "pppp", "cccc", "sppp", "777l",
				"ppps", "lppp", "cccg", "llpp", "pzcc", "ccgg", "pppp", "sscc", "llll", "zsss", "gggd", "ccdd", "ddds",
				"sscc", "cccc", "lllc", "cccg", "pppp", "lllp", "lppp", "zccc", "gppp", "dddd", "sssp", "pzss", "cccg",
				"plll", "lllp", "llll", "gggp", "ddzp", "ppzs", "sssp", "ppss", "ggpp", "ppll", "sssl", "gggp", "lccc",
				"ccgg", "cccg", "zppp", "cccg", "777l", "gggd", "dsss", "pppp", "pggg", "pzss", "sppp", "zsss", "pppp",
				"llld", "cccg", "gggp", "llld", "dddd", "pccc", "cccc", "llpp", "pzss", "pccc", "llpp", "7lll", "dddz",
				"llll", "llcc", "ddll", "lllp", "pppp", "pppp", "llll", "dsss", "pppl", "gggd", "slll", "lllc", "dddz",
				"llll", "llpp", "pppd", "ggpp", "ppcc", "llpp", "pppz", "dlll", "77ll", "zccc", "ddzp", "gppp", "llcc",
				"7777", "77ll", "cccd", "llll", "gppp", "ccgg", "ppss", "ppll", "lddd", "ccgg", "cccc", "cccc", "pppp",
				"gggg", "ggpp", "lllp", "pzss", "slll", "cddd", "pppp", "sssp", "pccc", "ppll", "llll", "dddd", "ccdd",
				"pppp", "zccc", "ddd7", "cggg", "ggdd", "cccg", "ccgg", "cggg", "gddd", "lllp", "cggg", "cccg", "gddd",
				"llll", "77ll", "slll", "ccgg", "ppdd", "d777", "lccc", "ccdd", "ccgg", "ppzc", "ddll", "pppp", "ccgg",
				"slll", "psss", "lllc", "ppcc", "llll", "slll", "ddds", "llpp", "pppp", "dd77", "cccd", "lccc", "cggg",
				"ppll", "cccg", "777l", "llll", "ppzc", "pddd", "77ll", "pccc", "777l", "dlll", "llpp", "gggd", "llld",
				"cccg", "ppcc", "cggg", "dddl", "777l", "plll", "cccg", "cggg", "llll", "ppps", "ggpp", "llll", "ggdd",
				"ssss", "ccgg", "777l", "sssl", "dsss", "ssss", "zccc", "cddd", "ssss", "cccc", "lccc", "psss", "sscc",
				"lppp", "gggp", "cccd", "sssl", "llpp", "sssp", "pzss", "pppd", "pppz", "7777", "pzcc", "gggp", "ddzp",
				"cddd", "pddd", "zccc", "cggg", "lllp", "dddd", "gggg", "gggg", "llll", "7777", "sssl", "ddss", "ppdd",
				"gppp", "ssss", "lllc", "psss", "pppp", "pppp", "cddd", "dlll", "77ll", "lppp", "ccdd", "ppps", "ddll",
				"llll", "ddss", "ppzs", "lppp", "dd77", "ppzs", "llll", "cccd", "pddd", "sssl", "cddd", "gggp", "ppll",
				"cccc", "ppcc", "llll", "sppp", "llll", "cccg", "cccg", "cccc", "lllc", "dlll", "lllp", "777l", "ggpp",
				"sppp", "ppps", "cccg", "plll", "777l", "plll", "cccg", "cccc", "pppp", "pppz", "llll", "pppl", "zccc",
				"ggdd", "pzcc", "pzcc", "sspp", "gggg", "dddl", "zccc", "sscc", "llpp", "llll", "lldd", "lllp", "zccc",
				"ddds", "d777", "lllc", "gggp", "cggg", "gggp", "dd77", "ggpp", "llll", "gggg", "ppcc", "dd77", "plll",
				"gppp", "ccgg", "lldd", "dddd", "llpp", "7lll", "pppz", "llcc", "ddds", "pppz", "cccd", "llll", "ggpp",
				"pppz", "ppps", "ppcc", "gggp", "lddd", "77ll", "pppl", "sscc", "psss", "ppzc", "cccg", "pppz", "cccg",
				"pppl", "pddd", "lllp", "ppll", "ppll", "sspp", "pppp", "llll", "ccgg", "gppp", "sssc", "llpp", "cccc",
				"7lll", "ppps", "ccdd", "ggdd", "dsss", "lddd", "ppzc", "d777", "pzcc", "cggg", "pppd", "ggpp", "sssc",
				"ppdd", "pppz", "gggd", "cccg", "dddd", "ppdd", "cccg", "sppp", "ssss", "lllp", "dd77", "pzss", "sppp",
				"zccc", "ppzs", "dddd", "lllp", "dddd", "pppp", "llll", "7lll", "dd77", "sssp", "psss", "sccc", "pppp",
				"sppp", "dddd", "gggp", "lllp", "pppp", "ccgg", "lllc", "cggg", "cggg", "ccgg", "d777", "llpp", "llll",
				"dd77", "pccc", "ppss", "pppl", "cggg", "pddd", "slll", "dzpp", "cccc", "cccc", "cggg", "pppp", "pppd",
				"pppz", "ppll", "pppp", "cggg", "pppd", "slll", "d777", "gggg", "llpp", "gggp", "7777", "ssss", "cccg",
				"gggg", "gggp", "cggg", "ddd7", "ppzc", "llcc", "777l", "slll", "lllp", "ccgg", "ppzc", "cggg", "lllp",
				"pddd", "dddd", "pppp", "ccgg", "lldd", "7777", "pppz", "sspp", "ssss", "dddz", "zppp", "ccgg", "gppp",
				"ssss", "ggdd", "pppp", "lddd", "dddd", "ccgg", "cccg", "pzcc", "ggdd", "cccc", "cccg", "gggp", "cccg",
				"ppll", "cggg", "dzpp", "gggd", "lddd", "ssss", "dddd", "ppcc", "ddds", "sscc", "pppl", "ddds", "ggpp",
				"cggg", "sssc", "dddd", "gppp", "llll", "ddll", "ddzp", "7777", "sssp", "ppzs", "zppp", "cccc", "gddd",
				"ggpp", "lllp", "llll", "llld", "slll", "ssll", "777l", "sccc", "ppzs", "cccd", "cccc", "cccd", "ddds",
				"ppss", "77ll", "cddd", "gppp", "gggg", "dddz", "cccg", "dlll", "dlll", "gggg", "lddd", "ppps", "pzss",
				"pppp", "sspp", "dddd", "sspp", "pppp", "cccg", "ddd7", "ccgg", "gggp", "ssss", "ddd7", "dddz", "lllc",
				"ggdd", "sssc", "dddd", "cggg", "ppdd", "cccc", "llcc", "pppl", "plll", "gddd", "gddd", "llpp", "lppp",
				"pppp", "dddd", "ccgg", "llld", "cggg", "ggdd", "gppp", "cccc", "7lll", "lppp", "cccc", "sssc", "ssss",
				"gppp", "ddss", "pppp", "cccg", "pppp", "zsss", "ccgg", "ppzs", "llld", "dddd", "ggdd", "cggg", "gggp",
				"cccg", "cccg", "cccc", "llpp", "slll", "lllc", "llpp", "cggg", "lppp", "gddd", "cggg", "llll", "llpp",
				"dddd", "sssl", "ppzs", "cccg", "dd77", "lppp", "psss", "slll", "lllp", "gggg", "gddd", "dddd", "ccgg",
				"pppz", "sssc", "gggg", "pppz", "ccdd", "gggp", "cccc", "cccc", "pppz", "dddd", "pppz", "pccc", "dd77",
				"dddl", "gppp", "cccg", "gggp", "lllc", "lllc", "lppp", "pppp", "ppzc", "dddd", "llll", "pzcc", "sssl",
				"ggdd", "llpp", "7777", "llll", "cccg", "cccc", "pppp", "slll", "llpp", "dzpp", "dd77", "llll", "ssss",
				"ppcc", "llcc", "lddd", "zsss", "ppdd", "lddd", "sssl", "cccg", "plll", "pppp", "sssl", "zppp", "lllp",
				"llpp", "llpp", "ddd7", "llll", "pppp", "psss", "ppps", "ssss", "dzpp", "pppp", "dddd", "pppp", "pddd",
				"sssp", "ddll", "pppp", "ddzp", "plll", "dddd", "sppp", "llld", "cccc", "pzss", "pzcc", "gggp", "slll",
				"lppp", "77ll", "lllp", "cggg", "dddd", "pppp", "llll", "pppz", "pddd", "lllc", "cccc", "sssc", "pppl",
				"cggg", "gggg", "sssc", "cccd", "gppp", "ddds", "cccd", "cddd", "ssll", "ddd7", "pppz", "ccdd", "pccc",
				"ccgg", "cccg", "ppss", "llll", "7777", "pzss", "gppp", "lllp", "sspp", },

				"7777llll",

				"dddd7777",

				new String[] { "7777llll", "ddddzpppp", "ppppzcccc", "ppppzssss", "dddd7777" },

				60, 140

		);

		Reel fifth = new Reel(new String[] {

				"plll", "sccc", "ssss", "sppp", "pggg", "ssss", "ppps", "ppcc", "pccc", "glll", "ppps", "cddd", "cccc",
				"ssll", "gggg", "psss", "llgg", "pppd", "lldd", "llpp", "slll", "pppp", "ssll", "dppp", "zppp", "777p",
				"sssl", "llld", "pppg", "7777", "pppl", "llll", "csss", "dppp", "ppgg", "lllp", "ppcc", "sspp", "gggc",
				"pppp", "cccs", "sscc", "ssss", "gccc", "pppl", "gggl", "ddpp", "cccz", "7ppp", "pppp", "llll", "sspp",
				"cccs", "llll", "dddd", "gggg", "llcc", "llll", "ssss", "sspp", "ccdd", "ddpp", "pppp", "ssll", "pppp",
				"ppss", "pggg", "7777", "dppp", "gggg", "llll", "ppss", "llll", "cccc", "ssss", "pppl", "dddp", "cccc",
				"psss", "lggg", "ccss", "pddd", "ssss", "zppp", "777p", "lddd", "lllc", "pppg", "7777", "llll", "pppl",
				"pppp", "pddd", "dppp", "lldd", "ggcc", "cccc", "cccc", "cccs", "lllc", "plll", "ccss", "ppps", "ppps",
				"pppp", "dddp", "ddpp", "dddd", "dlll", "llll", "lllc", "ppss", "plll", "pggg", "gccc", "sssl", "cddd",
				"lllg", "pppp", "czpp", "dddp", "lccc", "llgg", "gggc", "lll7", "gggc", "pppc", "ssss", "pggg", "psss",
				"ppll", "cczp", "llll", "sspp", "gggl", "cddd", "pppp", "pppp", "gggp", "pggg", "dddl", "dppp", "gggl",
				"ccss", "pppp", "pppc", "gggg", "lccc", "ccss", "cccd", "gppp", "ggpp", "dppp", "llll", "gccc", "gggg",
				"dddp", "csss", "lccc", "sszc", "ddll", "llll", "gppp", "llll", "sspp", "cccs", "lggg", "llgg", "llgg",
				"sppp", "sscc", "cccd", "ppss", "pppp", "glll", "lllp", "cczp", "gggl", "ssss", "dddl", "cccs", "pggg",
				"slll", "ppss", "ppcc", "czpp", "ccss", "gppp", "ssll", "ggpp", "pggg", "gg77", "lggg", "llgg", "ssll",
				"dddd", "llgg", "llll", "777p", "ppgg", "lddd", "zppp", "ppps", "ccdd", "pppp", "pppp", "gggg", "ggpp",
				"ccdd", "pccc", "gppp", "psss", "pppc", "pppg", "ppgg", "ppps", "ppgg", "psss", "psss", "gggg", "gppp",
				"ppss", "cccc", "ssll", "pppp", "llll", "cczp", "psss", "pppl", "csss", "sssc", "ssss", "ddpp", "cccc",
				"plll", "csss", "sssc", "lldd", "sssc", "sssl", "pppp", "cccc", "llld", "csss", "sssp", "gppp", "ssss",
				"ppss", "cccc", "7777", "ppss", "cccs", "lddd", "sppp", "ppgg", "ppll", "ppdd", "llgg", "ppcc", "sppp",
				"sppp", "sssl", "lllc", "cddd", "sssl", "ssss", "ddpp", "pppp", "sssl", "dddp", "czpp", "gggg", "cddd",
				"pddd", "sssc", "ppps", "ccdd", "cczp", "dlll", "dppp", "cccd", "sccc", "csss", "cccs", "ppss", "ppgg",
				"cddd", "ll77", "zccc", "g777", "slll", "llgg", "lggg", "7ppp", "7777", "pppc", "ssss", "ssss", "pccc",
				"ggg7", "dddp", "ddll", "dddl", "llcc", "dddp", "lggg", "gggg", "zccc", "sssp", "pppg", "sppp", "gggp",
				"7777", "ppps", "ggcc", "ppps", "ppss", "cccc", "llpp", "cccc", "dddp", "llll", "cccc", "dddl", "cczp",
				"sssl", "ppps", "cccd", "gggg", "llpp", "ssll", "lggg", "dddd", "csss", "csss", "ccdd", "gggl", "gccc",
				"lllg", "dddd", "llgg", "csss", "slll", "pggg", "sssl", "cccd", "ppps", "ccss", "pppp", "ddll", "cccz",
				"sssl", "pppd", "dddl", "pppl", "lccc", "gggp", "lllc", "llgg", "ddpp", "llll", "pppp", "ddpp", "gggp",
				"ddpp", "ppll", "slll", "pddd", "lll7", "pppp", "pggg", "gggc", "pppp", "cccs", "dddd", "gggl", "llpp",
				"l777", "lldd", "dddp", "dppp", "sssc", "ssss", "psss", "pppp", "dddd", "cccd", "pppp", "csss", "cccd",
				"lddd", "lccc", "gggg", "ccss", "cccc", "ddll", "pggg", "zppp", "pppd", "gggl", "plll", "pppp", "ggll",
				"ggpp", "glll", "lddd", "cccd", "dddp", "pccc", "ssss", "cccs", "7ppp", "lggg", "llld", "sssc", "dddp",
				"sccc", "pppp", "dddd", "ppdd", "ssll", "lldd", "gggg", "ddpp", "sssl", "ssll", "pggg", "lggg", "dlll",
				"pppp", "ll77", "ssll", "ppgg", "dddd", "dddd", "sssz", "dddp", "ppgg", "llll", "llpp", "gggc", "sspp",
				"sppp", "pggg", "ccdd", "ppll", "ccdd", "dddd", "gggg", "sssc", "sspp", "sssl", "dddd", "lllg", "gggg",
				"77pp", "cccd", "sssl", "plll", "pccc", "gggp", "pppl", "zccc", "pppg", "pccc", "gggl", "dddd", "pppc",
				"ssll", "pppp", "gggg", "lllc", "ddpp", "sppp", "slll", "gppp", "pppp", "lggg", "ggpp", "pppp", "plll",
				"dlll", "lldd", "ppgg", "zccc", "ppps", "ll77", "ssll", "zppp", "ggll", "ssss", "lggg", "dddp", "pppl",
				"ppcc", "lggg", "lggg", "llld", "llll", "gggl", "cddd", "ppgg", "pppp", "dlll", "lggg", "pppp", "pppg",
				"csss", "dppp", "ddll", "slll", "ssss", "cccs", "pppg", "lccc", "dddp", "ggpp", "llld", "llll", "cddd",
				"glll", "lddd", "pggg", "ssss", "dppp", "ddpp", "llll", "ppss", "zccc", "lddd", "cccc", "cccc", "pddd",
				"cccs", "ppll", "ccss", "lppp", "ggcc", "llll", "ssll", "cccs", "cccs", "llcc", "ccss", "sppp", "dddd",
				"llll", "llpp", "ddll", "lggg", "pppp", "sssp", "sppp", "llcc", "pppp", "pppp", "gggg", "dddl", "lllg",
				"zccc", "ssss", "gggp", "dddp", "ccss", "llll", "dppp", "pppg", "ssll", "pppp", "ddll", "lccc", "sspp",
				"gggg", "gggc", "ll77", "llll", "csss", "llll", "ppgg", "cccc", "dddl", "ssss", "ppll", "pppd", "sssc",
				"cczp", "ssll", "ccss", "psss", "llll", "plll", "llll", "pppc", "cczp", "sssc", "pppp", "ccss", "dddd",
				"glll", "llll", "lllg", "psss", "glll", "dddd", "lccc", "dddp", "psss", "plll", "cccd", "ppps", "cccc",
				"ggcc", "cddd", "777p", "lldd", "slll", "lldd", "gggp", "llll", "ssss", "ppdd", "ccdd", "dddl", "cddd",
				"sccc", "llgg", "pppp", "ssll", "pppp", "ggll", "ssll", "ppgg", "ggpp", "ppgg", "cccc", "g777", "sppp",
				"sspp", "pddd", "cccc", "ppll", "gppp", "gggl", "llld", "cccc", "ccss", "ddll", "ggpp", "zppp", "7777",
				"cccs", "czpp", "ggg7", "pppc", "ssll", "lggg", "lccc", "ppss", "llll", "gggp", "dlll", "ssll", "lggg",
				"gggp", "lddd", "lggg", "cccs", "plll", "cccc", "llll", "cccc", "pppp", "pppd", "777p", "sspp", "sppp",
				"lllp", "ccdd", "ppll", "77pp", "pppp", "lggg", "dppp", "dddl", "llgg", "czpp", "llll", "ssss", "llgg",
				"ssll", "llgg", "llld", "pppp", "lllp", "sssc", "dddd", "ddpp", "gppp", "pddd", "pggg", "sssp", "pppp",
				"pccc", "gppp", "llgg", "pccc", "zppp", "pccc", "dddd", "glll", "csss", "lddd", "csss", "ggg7", "ssll",
				"ccss", "llll", "lggg", "77pp", "ddpp", "ppgg", "lppp", "sssl", "lccc", "sssl", "llgg", "lldd", "gggp",
				"lccc", "cccc", "ddpp", "7ppp", "pppp", "cccc", "gppp", "lllc", "gggg", "sssp", "gggc", "czpp", "ccss",
				"gg77", "ppss", "psss", "gccc", "psss", "777p", "csss", "llcc", "clll", "pppl", "ssll", "pppg", "cccc",
				"pppp", "dddd", "gggg", "pppp", "llcc", "ppps", "cccc", "ccss", "dddp", "dddd", "77pp", "cccd", "cccc",
				"llll", "ssll", "lllc", "7777", "pccc", "ppll", "ggpp", "ssss", "sssp", "pppl", "l777", "ccss", "ppss",
				"ppps", "ssll", "llll", "ppss", "lccc", "gggc", "sszc", "sszc", "ppps", "cccd", "ppgg", "dlll", "pppp",
				"7777", "ssll", "ggcc", "lggg", "dddd", "dddd", "cddd", "lllc", "sssc", "cczp", "pccc", "dppp", "ddpp",
				"cccc", "ppll", "ddpp", "ggpp", "ccss", "dddd", "gggp", "pppp", "llgg", "plll", "lllc", "pppl", "plll",
				"ssss", "dppp", "dppp", "llgg", "77pp", "llgg", "dddd", "lllg", "ppss", "sssl", "pppp", "lllg", "pppg",
				"llll", "dddp", "pppp", "csss", "dddl", "ssll", "czpp", "ggpp", "ssll", "sccc", "cccc", "gggg", "gggl",
				"llll", "ssss", "gggg", "csss", "sssp", "gggc", "sssp", "llcc", "cccd", "cccz", "lddd", "7777", "gccc",
				"ccdd", "cccc", "ppcc", "sssl", "ddpp", "pggg", "llld", "pppp", "llll", "szcc", "ppps", "7777", "ccss",
				"llgg", "ssss", "7ppp", "cccc", "psss", "ssss", "szcc", "pppp", "lccc", "pppp",

		},

				"zccccdddd",

				"ppppssssz",

				new String[] { "zccccdddd", "ggggcccczppppssss", "llllgggg7777ppppdddd", "sssllll7777ppppdddd",
						"ppppssssz" },

				60, 280

		);

		/*
		 * Just point the reference.
		 */
		Reel reel = fifth;

		System.out.println(reel.observations());
		System.out.println(reel.neighbors());

		MonteCarloGenerator monte = new MonteCarloGenerator(reel);
		System.out.println(monte.generate(1000000000L, 10000L, 6, 10));

		// GeneticAlgorithmGenerator genetic = new
		// GeneticAlgorithmGenerator(reel);
		// System.out.println(genetic.generate(60L, 23, 0.9, 0.1, 0.1, 2));

		System.out.println("FINISH");
	}

}
