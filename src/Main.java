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
				"ccgg", "cccg", "ppss", "llll", "7777", "pzss", "gppp", "lllp", "sspp",

		},

				"7777llll",

				"dddd7777",

				new String[] { "7777llll", "ddddzpppp", "ppppzcccc", "ppppzssss", "dddd7777" },

				60, 140

		);

		Reel third = new Reel(new String[] {

				"sssc", "sssc", "ppps", "gggp", "cccc", "lllc", "lsss", "dppp", "cppp", "slll", "sccc", "ggpp", "pzgg",
				"ggll", "sccc", "ddll", "dlll", "llcc", "dddl", "cccd", "czdd", "cccc", "dddd", "lggg", "cccl", "ppzg",
				"sscc", "ssss", "ppgg", "sssl", "dddd", "gppp", "dlll", "ggpp", "ssss", "psss", "slll", "sssc", "cccc",
				"gggp", "dccc", "ggpp", "777d", "sss7", "pppp", "sssc", "pccc", "cccc", "cccl", "gggs", "cccp", "sscc",
				"clll", "ddll", "ssss", "gggg", "gggs", "cppp", "cccc", "lzss", "llss", "czdd", "llll", "cccp", "cccp",
				"ppcc", "ccll", "pccc", "gsss", "gppp", "dddd", "pzgg", "dlll", "ss77", "sccc", "ssss", "ssss", "ggpp",
				"llll", "dddd", "cccs", "cddd", "cppp", "sscc", "ccpp", "pppg", "77dd", "7ddd", "sccc", "llll", "csss",
				"ssll", "dddc", "cccc", "cccz", "dddc", "pppp", "ssss", "ssss", "cccc", "ccpp", "pzgg", "cccc", "dddp",
				"dddc", "cccz", "ssss", "ppps", "slll", "pppc", "pppp", "ssss", "gppp", "ccpp", "sssl", "sscc", "ss77",
				"ssss", "ccll", "cccc", "ppzg", "ggss", "cccc", "zsss", "7777", "ssll", "cccs", "ccss", "slll", "ggss",
				"ccpp", "ddcc", "gggg", "ggss", "sss7", "ppss", "glll", "gggp", "ssss", "s777", "ppzg", "sssc", "lllg",
				"ppss", "lggg", "dccc", "lccc", "ddpp", "ccpp", "cddd", "psss", "ccss", "pzgg", "ppcc", "cccd", "ggll",
				"ssll", "llll", "pppz", "lllg", "llzs", "pppp", "dppp", "77dd", "sssc", "ppcc", "llcc", "dccc", "777d",
				"pppg", "sssl", "sscc", "cccc", "7777", "llll", "ccpp", "dlll", "dddd", "sccc", "cccc", "ssss", "dddd",
				"lccc", "ppcc", "cccp", "ggll", "dccc", "sccc", "zggg", "ssss", "llzs", "llgg", "zsss", "ccll", "cccp",
				"csss", "pppz", "dddd", "sccc", "cppp", "ccpp", "ssll", "ccll", "sss7", "cccz", "llgg", "llls", "ppss",
				"lllz", "psss", "ssss", "sssc", "zggg", "sss7", "77dd", "ggss", "lccc", "gggs", "ddcc", "sscc", "cccc",
				"dppp", "dddp", "ssss", "dddd", "dddp", "pppz", "lggg", "lccc", "cccz", "cccp", "lccc", "lzss", "zsss",
				"sssc", "zddd", "sccc", "ccss", "gggg", "cccc", "lsss", "cccl", "cccc", "ssss", "ssll", "lzss", "ssss",
				"sccc", "dddd", "pppp", "sscc", "dddd", "llgg", "dlll", "pggg", "sssc", "zddd", "ppps", "ddll", "ssss",
				"77dd", "lllz", "cccs", "cppp", "zggg", "cccl", "gggg", "pppp", "cccp", "sccc", "ddpp", "7777", "dddd",
				"dppp", "pppp", "sscc", "777d", "gggg", "cccc", "lllz", "zggg", "dccc", "sccc", "lllg", "ssss", "clll",
				"gggg", "sssc", "sssl", "ccll", "sssc", "lsss", "zsss", "ccpp", "cddd", "pppc", "gppp", "czdd", "llll",
				"dppp", "pppc", "sssc", "llcc", "cccc", "sccc", "dccc", "ssss", "sssl", "gggl", "dddl", "gggp", "ssss",
				"dddl", "77dd", "gggp", "sccc", "ssss", "cccz", "llll", "ggss", "lllc", "czdd", "cccp", "gggg", "sssc",
				"gggl", "gggl", "lggg", "ccpp", "dlll", "llss", "dddd", "sssl", "ccss", "llgg", "cddd", "sccc", "ssll",
				"ddpp", "cccl", "cccc", "dlll", "llls", "ggll", "pppp", "7777", "dddd", "gggg", "dddd", "ss77", "dddd",
				"dddc", "ccdd", "czdd", "cccl", "gggs", "ss77", "cccc", "slll", "pppp", "pppp", "lsss", "ccpp", "ssss",
				"cccc", "cccp", "cddd", "cccp", "pppp", "lsss", "pppc", "cccz", "dddl", "dddl", "s777", "sss7", "dppp",
				"cccc", "ppgg", "ccss", "llll", "llss", "ggpp", "dppp", "czdd", "cppp", "ppcc", "zsss", "pppp", "dlll",
				"sccc", "lsss", "ddcc", "ssss", "pccc", "lzss", "ggss", "cccc", "sssc", "ppss", "sssc", "ssss", "gggg",
				"sscc", "sccc", "ssss", "cccp", "777d", "ssll", "dddc", "sssc", "ss77", "ccdd", "czdd", "clll", "ccdd",
				"pzgg", "ppcc", "lllc", "cccp", "gggl", "ccss", "cccc", "dddc", "llgg", "dccc", "gggg", "lllg", "cccd",
				"ppps", "pppp", "sscc", "gggl", "llll", "ppss", "gggg", "llls", "7ddd", "slll", "pppg", "ccll", "pggg",
				"cczd", "dddd", "lccc", "sssc", "cccc", "llll", "cccc", "ppgg", "ccll", "s777", "glll", "ddpp", "cccp",
				"ddll", "pppc", "llll", "dppp", "llss", "llll", "llll", "ssss", "ccss", "sccc", "ccpp", "lllc", "llcc",
				"ccll", "lzss", "llgg", "csss", "pppp", "s777", "ddll", "lccc", "slll", "dddd", "sccc", "lggg", "sccc",
				"777d", "777d", "dddd", "cccs", "ppps", "pppz", "csss", "zddd", "cppp", "gggs", "glll", "llcc", "sssl",
				"pppp", "sscc", "llls", "dddl", "sccc", "llll", "cccz", "sscc", "sscc", "lllg", "gggg", "cccc", "sccc",
				"sccc", "cppp", "lzss", "pppp", "pppz", "sscc", "lzss", "sccc", "dddd", "sss7", "cccc", "lccc", "ss77",
				"dddd", "s777", "ppzg", "lllc", "dddl", "pppp", "s777", "llls", "cppp", "pppg", "llll", "sscc", "ggpp",
				"llll", "gggg", "s777", "cccs", "sss7", "sss7", "cccl", "pccc", "llgg", "777d", "777d", "ssss", "zddd",
				"llgg", "s777", "dccc", "sscc", "gggl", "pccc", "lllc", "7777", "sscc", "lccc", "ggss", "pppp", "ssss",
				"pggg", "7ddd", "dppp", "llll", "llss", "ppss", "gppp", "dccc", "sssl", "ssss", "gppp", "ccpp", "pppp",
				"sccc", "ccdd", "llll", "cccc", "sssc", "llss", "cccc", "glll", "cccp", "sccc", "lsss", "ccpp", "llss",
				"ddll", "sscc", "ggss", "llls", "ss77", "s777", "cccz", "gggl", "ddll", "cppp", "ssss", "sssc", "glll",
				"pggg", "lllc", "ssss", "csss", "77dd", "ggll", "dddd", "dccc", "pppp", "ssss", "pppp", "ddcc", "llll",
				"cppp", "zddd", "ssss", "gggg", "ssss", "llss", "cccc", "ppps", "gggg", "cccz", "sssc", "dddd", "dddd",
				"dddd", "clll", "cccp", "77dd", "pggg", "ggss", "pppc", "llll", "dddc", "7ddd", "lccc", "llll", "glll",
				"sscc", "pccc", "cddd", "pzgg", "cccz", "cddd", "llll", "ssss", "pppp", "ddll", "ggll", "clll", "gsss",
				"pppg", "pppz", "glll", "ddcc", "lllg", "ssss", "czdd", "lllz", "sssc", "lzss", "sssc", "ccpp", "cccl",
				"gggg", "sccc", "llll", "cccz", "pppp", "llll", "pppc", "7ddd", "cccc", "ggpp", "ssll", "dppp", "ssss",
				"sssl", "ccpp", "ggll", "pppp", "llcc", "gggg", "llgg", "dddl", "cccc", "cccc", "ppgg", "llll", "ppgg",
				"dddp", "sscc", "lllg", "dppp", "sssl", "sscc", "gggs", "cccp", "glll", "gggs", "sssc", "lllz", "pppp",
				"gggs", "clll", "ssss", "llls", "dddd", "pggg", "ppgg", "lzss", "cccc", "zggg", "dddl", "ss77", "cddd",
				"pppp", "cccz", "sscc", "cccz", "llcc", "cppp", "pppp", "ggpp", "zddd", "dddd", "sscc", "sss7", "lsss",
				"7777", "ppss", "llss", "zggg", "sccc", "ppps", "ccpp", "sscc", "sscc", "csss", "ggss", "cczd", "zsss",
				"ggss", "lggg", "pppp", "llll", "ppgg", "gggs", "dccc", "lsss", "cccp", "llll", "llll", "sscc", "7ddd",
				"ccpp", "pppz", "sssc", "sssl", "sccc", "sscc", "777d", "sssc", "dddl", "sssc", "cczd", "cccc", "pppp",
				"pccc", "cccc", "pppp", "csss", "ddll", "ggll", "ccpp", "ss77", "lllc", "ccpp", "clll", "dddc", "pppp",
				"cccs", "ccpp", "dddp", "lggg", "sssc", "dddd", "ddpp", "sscc", "gggp", "zsss", "dddp", "llzs", "llgg",
				"pppz", "ssll", "zsss", "cccc", "slll", "gggl", "ccpp", "llll", "cccp", "sscc", "ssss", "sccc", "sssl",
				"czdd", "ddll", "dddd", "llls", "dlll", "llll", "cccl", "cccc", "sscc", "llll", "ppcc", "dddd", "llll",
				"cccd", "ssss", "llcc", "pppp", "cccz", "dppp", "dddd", "zddd", "cccp", "cccc", "llll", "ppps", "sssc",
				"ssss", "cczd", "pppp", "psss", "dccc", "pppp", "cccp", "cccp", "dddp", "gggs", "sssc", "ppps", "cppp",
				"llls", "llll", "ccpp", "pppg", "77dd", "llll", "pppg", "llll", "psss", "cccc", "7ddd", "cddd", "llss",
				"cccc", "pzgg", "zggg", "ppcc", "llzs", "dddl", "ccpp", "gsss", "clll", "cccl", "cczd", "ssss", "psss",
				"llss", "ssss", "llzs", "sscc", "dccc", "gggp", "cccl", "sscc", "llgg", "pppp",

		},

				"7777dddd",

				"ccccssss7777",

				new String[] { "7777dddd", "ggggppppzgggg", "sssscccczdddd", "ggggllllzssss", "ccccssss7777" },

				75, 160

		);

		Reel fourth = new Reel(new String[] {

				"dlll", "llll", "ddss", "gggp", "plll", "ssss", "cccc", "7lll", "sssc", "zlll", "sscc", "dlll", "77ll",
				"pppp", "sppp", "ssss", "lllc", "lllc", "pppp", "pppp", "sssp", "ssss", "llll", "cggg", "gddd", "gggg",
				"pppl", "pppp", "psss", "cccc", "llzc", "lccc", "lddd", "ppzl", "gggp", "ppll", "ppps", "cccc", "p777",
				"cccc", "ssss", "psss", "sppp", "ddpp", "sssc", "llll", "sccc", "cccp", "dddl", "cccc", "llgg", "ccdd",
				"llll", "ppll", "llgg", "gggg", "cppp", "ppp7", "cccd", "ppp7", "ssss", "pppp", "gggg", "dddd", "pppz",
				"lllc", "sppp", "sspp", "cccg", "dppp", "ppzl", "llcc", "cccd", "sscc", "cccg", "gggd", "p777", "sspp",
				"ggpp", "ppll", "pppp", "ggpp", "dddd", "sspp", "cccc", "dddd", "pppp", "gsss", "ssss", "ddds", "llll",
				"sssp", "llll", "p777", "cccg", "dddp", "777l", "lllc", "dddd", "cggg", "7lll", "llcc", "cddd", "ppp7",
				"sppp", "ppp7", "dddl", "pppl", "cddd", "77ll", "dccc", "cddd", "gsss", "sspp", "ppll", "ccpp", "sssp",
				"gggs", "ccdd", "llll", "cggg", "777l", "zccc", "gggg", "cccc", "gggg", "cggg", "ccdd", "gggs", "lzcc",
				"cccc", "dppp", "ggss", "lzcc", "dccc", "gggp", "7lll", "zlll", "dddl", "llll", "ggdd", "lllc", "pppl",
				"lggg", "cppp", "pp77", "ppp7", "777l", "ggpp", "pppl", "dddd", "ppll", "cccg", "ccdd", "cccp", "lllz",
				"ddll", "777l", "llll", "zccc", "cddd", "dlll", "llll", "lldd", "gddd", "gggg", "ddss", "gggg", "ddss",
				"pppp", "llll", "gggs", "ccdd", "dddc", "ppzl", "lzcc", "llll", "ggss", "ggss", "ddcc", "ppss", "cggg",
				"cccg", "lldd", "cccp", "ssss", "ddll", "ppps", "plll", "gggg", "pppp", "llcc", "ddll", "dddd", "cppp",
				"sssp", "cccd", "pppp", "cccg", "ccgg", "cccc", "ppps", "cddd", "llll", "gggp", "sccc", "ppll", "llll",
				"zccc", "llgg", "7lll", "sssp", "llll", "llll", "ppll", "pppp", "dddd", "dddd", "ddss", "zlll", "pppz",
				"sppp", "llll", "ddds", "sscc", "sssc", "ddcc", "lzcc", "ppss", "ssss", "ssss", "sscc", "lzcc", "lccc",
				"pppl", "p777", "dccc", "lldd", "plll", "pppl", "ccdd", "dddc", "ppzl", "pppp", "sppp", "7lll", "lllc",
				"gsss", "pppp", "ppss", "pppl", "ppzl", "cggg", "zccc", "cppp", "gggs", "ddll", "sppp", "sccc", "llll",
				"sppp", "pzll", "gggd", "ccgg", "lllg", "llll", "ssss", "gggg", "ssss", "plll", "sssc", "cccg", "sssp",
				"lddd", "dppp", "dddd", "sscc", "gggp", "lllc", "llcc", "ddds", "cggg", "pp77", "777l", "ccdd", "cccg",
				"dddd", "ggpp", "cccg", "cccc", "lldd", "sssp", "llll", "pppp", "ddpp", "dsss", "llgg", "ccgg", "sssc",
				"ccdd", "dccc", "gppp", "cggg", "ddds", "plll", "ssss", "cccg", "ggdd", "llgg", "cppp", "gggp", "llll",
				"7lll", "pppp", "cppp", "lddd", "sssp", "cccd", "cccc", "ggpp", "dddd", "llld", "sppp", "cppp", "llll",
				"dddp", "gsss", "sssp", "7lll", "pppl", "sspp", "zccc", "777l", "pppp", "gsss", "pppp", "lddd", "gggg",
				"pzll", "dddd", "dsss", "sppp", "dddl", "ccdd", "cccg", "lllz", "sspp", "ppps", "sssp", "cccg", "lllc",
				"llld", "ggss", "llcc", "ddds", "ppll", "gggd", "lllz", "plll", "llll", "ccgg", "gggg", "llcc", "dccc",
				"ppll", "cggg", "ggss", "llld", "cccp", "llll", "lggg", "ppll", "pppp", "zccc", "pppp", "ddll", "gggg",
				"lllc", "cccg", "llll", "cddd", "sssp", "lccc", "ddll", "dppp", "ddll", "ggpp", "ssss", "gppp", "sssp",
				"sppp", "lllz", "pppp", "dlll", "dsss", "sspp", "dddd", "llld", "lllz", "llll", "lllz", "llll", "gggg",
				"lzcc", "gggg", "dccc", "dddd", "sspp", "dddl", "dccc", "lldd", "plll", "ddds", "cccp", "lggg", "lldd",
				"ppll", "llll", "pppp", "cccd", "cddd", "dccc", "lldd", "cccg", "sscc", "ppp7", "sscc", "lddd", "pppp",
				"llll", "ppss", "zccc", "lllg", "sssp", "gggg", "zccc", "cccd", "ssss", "cccc", "ddll", "sscc", "ssss",
				"ddss", "cccc", "7lll", "dddc", "dddd", "ddds", "sssp", "llzc", "ppll", "sssc", "cccp", "cccg", "llll",
				"dddp", "gppp", "ssss", "ddpp", "gggg", "llld", "pppl", "llcc", "dddd", "dddd", "cccc", "cccc", "lllc",
				"sssc", "ccpp", "ccpp", "ccgg", "lggg", "lddd", "ppll", "sccc", "lllc", "cccc", "sspp", "ssss", "llll",
				"cccc", "ggdd", "pppp", "pppp", "ccdd", "lddd", "cccg", "pp77", "ppll", "cccg", "cggg", "777l", "ccpp",
				"dddd", "ppss", "plll", "dppp", "ccgg", "llll", "gppp", "ccdd", "gggs", "cddd", "psss", "77ll", "ppll",
				"777l", "sssc", "cggg", "ppll", "gppp", "ggdd", "lldd", "sssc", "plll", "ccpp", "llll", "cppp", "cccg",
				"psss", "cccc", "ddpp", "gggs", "lddd", "ppss", "ppss", "zccc", "cddd", "gddd", "pp77", "pppp", "dccc",
				"7777", "gppp", "sscc", "sssp", "sspp", "ccgg", "pppp", "dddl", "llll", "psss", "sccc", "gsss", "pppp",
				"pzll", "pppp", "ddpp", "lllg", "ppss", "lllc", "gsss", "ccgg", "ccgg", "zccc", "zccc", "zccc", "pppp",
				"lllc", "lllg", "gggg", "ssss", "pppp", "cggg", "dddd", "pppl", "pppz", "lccc", "ddcc", "zccc", "cddd",
				"lllz", "psss", "ssss", "ccgg", "ppll", "cccp", "pp77", "cddd", "dddd", "pppl", "dsss", "llgg", "pppp",
				"cggg", "lllc", "dlll", "ccgg", "ggss", "llll", "lllc", "cccg", "cddd", "sspp", "llll", "dddd", "cccp",
				"plll", "ssss", "llld", "llcc", "lllc", "sssp", "cppp", "gggg", "cddd", "lddd", "lllc", "gggs", "lddd",
				"ssss", "ggpp", "pppl", "cccd", "gggp", "plll", "cppp", "dddd", "gggs", "psss", "lllc", "pppp", "ggdd",
				"lccc", "p777", "pppp", "cccc", "ddpp", "777l", "777l", "cccg", "dsss", "pppp", "ccdd", "gggp", "lggg",
				"cccc", "dddl", "777l", "ppss", "cccg", "plll", "sccc", "llgg", "ppp7", "pppp", "sppp", "7777", "zlll",
				"pppp", "pppp", "sspp", "cccc", "llll", "llgg", "pppp", "cggg", "sspp", "pppz", "ssss", "dppp", "dddp",
				"cddd", "llzc", "pppl", "dccc", "pppp", "ppss", "ppss", "sccc", "cccd", "lggg", "7lll", "dccc", "llgg",
				"gggg", "cddd", "gggp", "llgg", "gggg", "gggp", "ppll", "pppp", "sppp", "lccc", "cccc", "llgg", "llld",
				"cccd", "cggg", "llll", "sssc", "lllz", "zlll", "sssp", "gggd", "gggd", "lddd", "gggs", "7lll", "dddp",
				"ddll", "ssss", "dddd", "cccg", "dddc", "ccdd", "llll", "llll", "dddd", "pzll", "llll", "ppll", "ggss",
				"plll", "gggp", "ddcc", "llll", "zlll", "llll", "llll", "p777", "cccc", "pppz", "ddss", "cccg", "llcc",
				"plll", "ggss", "ddcc", "ppps", "gppp", "llll", "sspp", "llld", "cggg", "lccc", "pppp", "gddd", "sppp",
				"zccc", "cccp", "pppp", "cccc", "plll", "cccc", "ggpp", "ddds", "gddd", "ccpp", "gggg", "7lll", "lggg",
				"ppzl", "ppll", "lccc", "lccc", "sspp", "ggpp", "lldd", "cccg", "ppll", "lllz", "77ll", "dlll", "sppp",
				"cddd", "ddcc", "ggdd", "lllz", "dddp", "ccpp", "ppzl", "dddc", "lzcc", "gggs", "ddcc", "ggss", "ddcc",
				"llcc", "lllc", "ccpp", "ddss", "pppp", "sccc", "ppzl", "dddc", "pppz", "cccc", "cccc", "ssss", "cccc",
				"7lll", "dddd", "ddss", "cccd", "sppp", "cccg", "ppss", "cccc", "lccc", "gggd", "gggp", "llzc", "ppll",
				"zccc", "7lll", "7lll", "pp77", "gggg", "lldd", "pppl", "cccc", "sppp", "ccgg", "cccc", "ssss", "cccc",
				"llll", "ppzl", "lllz", "lllc", "gggs", "gggg", "cccc", "cccd", "dppp", "cccg", "dddd", "ccgg", "ppps",
				"pppp", "sccc", "cggg", "ppp7", "llll", "ccgg", "pppz", "llll", "cppp", "ccdd", "lzcc", "pppp", "lldd",
				"gppp", "gggs", "ccgg", "ssss", "lllg", "sppp", "gggs", "ccpp", "ddll", "pp77", "dppp", "dccc", "ssss",
				"cccd", "gggg", "pppp", "ddds", "pppp", "pppz", "cccg", "cccc", "pppz", "pp77", "zlll", "pppp", "cccc",
				"pppz", "pppp", "cppp", "sspp", "ppll", "gggg", "ddds", "7lll", "ccgg", "ddll",

		},

				"7777lllldddd",

				"sssspppp7777",

				new String[] { "7777lllldddd", "ssssppppzllllcccc", "ppppllllzccccpppp", "sssspppp7777" },

				75, 160

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

				new String[] { "zccccdddd", "ggggcccczppppssss", "llllgggg7777ppppdddd", "ssssllll7777ppppdddd",
						"ppppssssz" },

				60, 280

		);

		/*
		 * Just point the reference.
		 */
		Reel reel = fourth;

		System.out.println(reel.observations());
		System.out.println(reel.neighbors());

		/*
		 * For single solution checking.
		 */
		// String solution = "";
		// String[] wrong = reel.wrongSegments(solution);
		// String[] missing = reel.missingObservations(solution);
		// System.out.println(
		// 		wrong.length + "\t" + missing.length + "\t" + reel.distance(solution) + "\t" + solution.length() + "\t"
		// 				+ solution + "\t" + Arrays.toString(wrong) + "\t" + Arrays.toString(missing));

		/*
		 * Monte-Carlo search based optimization.
		 */
		MonteCarloGenerator monte = new MonteCarloGenerator(reel);
		System.out.println(monte.generate(100000000L, 10000L, 6, 10));

		/*
		 * Genetic algorithm based optimization.
		 */
		// GeneticAlgorithmGenerator genetic = new
		// GeneticAlgorithmGenerator(reel);
		// System.out.println(genetic.generate(60L, 23, 0.9, 0.1, 0.1, 2));

		System.out.println("FINISH");
	}

}
