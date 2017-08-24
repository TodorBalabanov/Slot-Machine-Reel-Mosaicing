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

				"ppllll", "sscccc", "pssssz", "sspppp", "ppgggg", "cssssp", "ppppss", "pppccc", "ppcccc", "ggllll",
				"ppppss", "ccdddd", "gccccz", "ssslll", "lggggc", "ppssss", "lllggg", "ppppdd", "lllddd", "lllppp",
				"ssllll", "zpppps", "ssslll", "ddpppp", "czpppp", "7777pp", "ssssll", "lllldd", "ppppgg", "77777p",
				"ppppll", "pllllc", "ccssss", "ddpppp", "pppggg", "llllpp", "pppccc", "sssppp", "ggggcc", "zpppps",
				"ccccss", "sssccc", "pssssl", "ggcccc", "ppppll", "ggggll", "dddppp", "cccczp", "77pppp", "dppppg",
				"glllld", "sssppp", "ccccss", "glllld", "pddddl", "pggggl", "lllccc", "sllllg", "pssssc", "sssppp",
				"cccddd", "dddppp", "zpppps", "ssslll", "zpppps", "pppsss", "ppgggg", "g7777p", "ddpppp", "lggggp",
				"sllll7", "pppsss", "slllld", "lccccs", "pssssz", "ppppll", "ddddpp", "lccccs", "ppssss", "llgggg",
				"cccsss", "ppdddd", "pssssl", "czpppp", "7777pp", "lldddd", "llllcc", "ppppgg", "77777p", "dllllg",
				"ppppll", "sppppg", "ppdddd", "ddpppp", "lllddd", "gggccc", "gccccz", "lccccs", "ccccss", "llllcc",
				"ppllll", "cccsss", "ppppss", "ppppss", "dppppl", "ddddpp", "dddppp", "cddddp", "ddllll", "pllllc",
				"llllcc", "pppsss", "ppllll", "ppgggg", "ggcccc", "ssssll", "ccdddd", "llllgg", "gpppps", "cczppp",
				"ddddpp", "llcccc", "lllggg", "ggggcc", "llll77", "ggggcc", "ppppcc", "cssssl", "ppgggg", "ppssss",
				"ppplll", "ccczpp", "sllll7", "sssppp", "ggggll", "ccdddd", "gpppps", "dppppl", "ggggpp", "ppgggg",
				"ddddll", "ddpppp", "ggggll", "cccsss", "dppppl", "ppppcc", "pggggl", "llcccc", "cccsss", "ccccdd",
				"ggpppp", "gggppp", "ddpppp", "slllld", "ggcccc", "lgggg7", "ddddpp", "ccssss", "llcccc", "ssszcc",
				"dddlll", "glllld", "ggpppp", "pllllc", "sssppp", "ccccss", "llgggg", "lllggg", "lllggg", "sspppp",
				"sssccc", "ccccdd", "pppsss", "dppppg", "ggllll", "llllpp", "ccczpp", "ggggll", "pssssl", "ddddll",
				"ccccss", "ppgggg", "ssllll", "pppsss", "pppccc", "cczppp", "cccsss", "ggpppp", "ssslll", "gggppp",
				"ppgggg", "ggg777", "llgggg", "lllggg", "ssslll", "cddddp", "lllggg", "pllllc", "7777pp", "pppggg",
				"lldddd", "czpppp", "ppppss", "cccddd", "sppppc", "sppppc", "lggggc", "gggppp", "cccddd", "ppcccc",
				"ggpppp", "ppssss", "ppppcc", "ppppgg", "pppggg", "ppppss", "pppggg", "ppssss", "ppssss", "lggggp",
				"ggpppp", "pppsss", "gccccz", "ssslll", "sppppg", "pllllc", "ccczpp", "ppssss", "ppppll", "ccssss",
				"sssscc", "pssssz", "dddppp", "gccccz", "ppllll", "ccssss", "sssscc", "lllddd", "sssscc", "ssssll",
				"gpppps", "gccccz", "lllldd", "ccssss", "sssspp", "ggpppp", "cssssp", "pppsss", "pccccs", "l7777p",
				"pppsss", "ccccss", "lldddd", "sspppp", "pppggg", "ppplll", "pppddd", "lllggg", "pppccc", "sspppp",
				"sspppp", "ssssll", "llllcc", "ccdddd", "ssssll", "cssssp", "dddppp", "dppppg", "ssssll", "ddddpp",
				"cczppp", "pggggc", "ccdddd", "ppdddd", "sssscc", "ppppss", "cccddd", "ccczpp", "ddllll", "ddpppp",
				"ccccdd", "sscccc", "ccssss", "ccccss", "pppsss", "pppggg", "ccdddd", "lll777", "szcccc", "gg7777",
				"ssllll", "lllggg", "llgggg", "77pppp", "77777p", "ppppcc", "cssssl", "cssssl", "ppcccc", "gggg77",
				"ddddpp", "dddlll", "ddddll", "lllccc", "ddddpp", "llgggg", "lggggc", "szcccc", "sssspp", "ppppgg",
				"sspppp", "ggggpp", "77777p", "ppppss", "gggccc", "ppppss", "pppsss", "pccccs", "lllppp", "lccccs",
				"ddddpp", "dllllg", "lccccs", "ddddll", "ccczpp", "ssssll", "ppppss", "ccccdd", "lggggc", "lllppp",
				"ssslll", "llgggg", "cddddp", "ccssss", "ccssss", "cccddd", "ggggll", "ggcccc", "llllgg", "pddddl",
				"lllggg", "ccssss", "ssllll", "ppgggg", "ssssll", "ccccdd", "ppppss", "cccsss", "lpppps", "dddlll",
				"cccczp", "ssssll", "ppppdd", "ddddll", "ppppll", "llcccc", "ggggpp", "llllcc", "lllggg", "dddppp",
				"pllllc", "lpppps", "dddppp", "ggggpp", "dddppp", "ppplll", "ssllll", "ppdddd", "llll77", "lpppps",
				"ppgggg", "ggggcc", "7ppppd", "ccccss", "lddddp", "ggggll", "lllppp", "ll7777", "lllddd", "ddddpp",
				"ddpppp", "sssscc", "pssssz", "ppssss", "dppppl", "cddddp", "ccccdd", "dppppg", "ccssss", "ccccdd",
				"lldddd", "llcccc", "pggggl", "cccsss", "zccccd", "dddlll", "ppgggg", "czpppp", "ppppdd", "ggggll",
				"ppllll", "dppppg", "ggglll", "gggppp", "ggllll", "lldddd", "ccccdd", "ddddpp", "ppcccc", "cssssp",
				"ccccss", "77pppp", "llgggg", "lllldd", "sssscc", "ddddpp", "sscccc", "sppppc", "pddddl", "pppddd",
				"ssslll", "lllddd", "lggggc", "dddppp", "ssssll", "ssslll", "ppgggg", "llgggg", "ddllll", "dppppg",
				"lll777", "ssslll", "pppggg", "lddddp", "pddddl", "sssszc", "ddddpp", "pppggg", "dllllg", "lllppp",
				"ggggcc", "sssppp", "sspppp", "ppgggg", "cccddd", "ppplll", "cccddd", "lddddp", "pggggc", "sssscc",
				"sssppp", "ssssll", "cddddp", "llllgg", "pggggl", "777ppp", "ccccdd", /* "lsssll", */ "ppllll",
				"ppcccc", "lgggpp", "ppppll", "szcccc", "ppppgg", "ppcccc", "ggggll", "pddddl", "ppppcc", "ssslll",
				"zpppps", "lggggc", "plllcc", "dddppp", "sspppp", "ssllll", "ggpppp", "gpppps", "llgggg", "gggppp",
				"zpppps", "ppllll", "ddllll", "lllddd", "pppggg", "szcccc", "ppppss", "lll777", "ssslll", "czpppp",
				"ggglll", "pssssz", "llgggg", "ddddpp", "ppppll", "pppccc", "llgggg", "llgggg", "lllldd", "plllld",
				"ggggll", "ccdddd", "pppggg", "dppppg", "ddllll", "llgggg", "gpppps", "ppppgg", "ccssss", "ddpppp",
				"dddlll", "ssllll", "pssssl", "ccccss", "ppppgg", "llcccc", "ddddpp", "gggppp", "lllldd", "pllllc",
				"ccdddd", "ggllll", "lldddd", "ppgggg", "cssssl", "ddpppp", "dddppp", "pllllc", "pppsss", "szcccc",
				"lldddd", "lccccs", "lccccs", "ppdddd", "ccccss", "ppplll", "cccsss", "llpppp", "gggccc", "dllllg",
				"ssslll", "scccss", "ccccss", "lllccc", "cccsss", "sspppp", "cddddp", "dllllg", "lllppp", "dddlll",
				"llgggg", "dppppg", "sssspp", "sspppp", "lllccc", "sppppg", "sppppc", "lggggp", "ddddll", "llllgg",
				"szcccc", "cssssl", "ggggpp", "ddddpp", "cccsss", "sllllg", "ddpppp", "ppppgg", "ssslll", "dppppl",
				"dddlll", "llcccc", "sssppp", "pggggl", "ggggcc", "lll777", "glllld", "ccssss", "dllllg", "pppggg",
				"zccccd", "ddddll", "cssssl", "ppplll", "ppppdd", "sssscc", "ccczpp", "ssslll", "cccsss", "ppssss",
				"sllllp", "ppllll", "pllllc", "ppppcc", "ccczpp", "sssscc", "gpppps", "cccsss", "lddddp", "ggllll",
				"glllld", "llllgg", "ppssss", "ggllll", "cddddl", "llcccc", "ddddpp", "ppssss", "ppllll", "ccccdd",
				"ppppss", "gccccz", "gggccc", "ccdddd", "7777pp", "lllddd", "ssllll", "lllddd", "ggggpp", "glllld",
				"cssssp", "pppddd", "cccddd", "ddddll", "ccdddd", "sscccc", "lllggg", "dppppl", "ssslll", "dppppg",
				"ggglll", "ssslll", "pppggg", "gggppp", "pppggg", "gccccz", "gg7777", "sspppp", "sssppp", "ppdddd",
				"sccccd", "ppplll", "ggpppp", "ggggll", "lllldd", "pccccd", "cccsss", "dddlll", "gggppp", "czpppp",
				"g7777p", "ccccss", "cczppp", "gggg77", "ppppcc", "ssslll", "llgggg", "llcccc", "pppsss", "sllll7",
				"ggggpp", "ddllll", "ssslll", "llgggg", "ggggpp", "lldddd", "llgggg", "ccccss", "ppllll", "pccccs",
				"sllllp", "pccccs", "dppppl", "ppppdd", "7777pp", "sssppp", "sspppp", "llllpp", "cccddd", "ppplll",
				"777ppp", "dppppl", "llgggg", "ddpppp", "ddddll", "lllggg", "cczppp", "dllllg", "pssssc", "lllggg",
				"ssslll", "lllggg", "lllldd", "lpppps", "llllpp", "sssscc", "cddddp", "dddppp", "ggpppp", "ppdddd",
				"ppgggg", "sssspp", "gpppps", "ppcccc", "ggpppp", "lllggg", "ppcccc", "czpppp", "ppcccc", "cddddp",
				"ggllll", "ccssss", "lldddd", "ccssss", "gggg77", "ssslll", "cccsss", "sllllp", "llgggg", "777ppp",
				"dddppp", "pppggg", "llpppp", "ssssll", "llcccc", "ssssll", "lllggg", "lllddd", "ggggpp", "llcccc",
				"gccccs", "dddppp", "77pppp", "sppppc", "lccccs", "ggpppp", "llllcc", "lggggp", "sssspp", "ggggcc",
				"cczppp", "cccsss", "ggg777", "pppsss", "ppssss", "ggcccc", "ppssss", "7777pp", "ccssss", "lllccc",
				"ccllll", "ppppll", "ssslll", "ppppgg", "pccccs", "dppppg", "cddddl", "lgggg7", "dppppl", "lllccc",
				"ppppss", "lccccs", "cccsss", "ddddpp", "cddddp", "777ppp", "ccccdd", "lccccs", "dllllg", "ssslll",
				"llllcc", /* "c7777p", */ "ppcccc", "ppplll", "gggppp", "cssssp", "sssspp", "ppppll", "ll7777",
				"cccsss", "pppsss", "ppppss", "ssslll", "sllllg", "pppsss", "llcccc", "ggggcc", "ssszcc", "ssszcc",
				"ppppss", "ccccdd", "pppggg", "ddllll", "dppppg", "g7777p", "ssslll", "gggccc", "llgggg", "lddddp",
				"cddddp", "ccdddd", "llllcc", "sssscc", "ccczpp", "ppcccc", "ddpppp", "dddppp", "gccccz", "ppplll",
				"dddppp", "gggppp", "cccsss", "cddddp", "ggggpp", "sppppc", "lllggg", "ppllll", "llllcc", "ppppll",
				"ppllll", "pssssc", "ddpppp", "ddpppp", "lllggg", "777ppp", "lllggg", "lddddp", "llllgg", "pppsss",
				"ssssll", "gpppps", "llllgg", "ppppgg", "pllllc", "ddddpp", "zpppps", "ccssss", "ddddll", "ssslll",
				"cczppp", "gggppp", "ssslll", "sscccc", "gccccs", "pggggl", "ggggll", "slllld", "pssssc", "pggggl",
				"ccssss", "sssspp", "ggggcc", "sssspp", "lllccc", "ccccdd", "cccczp", "lldddd", "g7777p", "ggcccc",
				"cccddd", "gccccs", "pppccc", "ssssll", "dddppp", "ppgggg", "lllldd", "dppppl", "slllld", "sszccc",
				"ppppss", "77777p", "cccsss", "lllggg", "cssssp", "77pppp", "pccccs", "ppssss", "pssssl", "sszccc",
				"7ppppd", "llcccc", "dppppl", "clllld", "cllllg", "cllllp", "c77777", "plllld", "pllllc", "plllld",
				"pllllg",

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
		System.out.println(monte.generate(100000000L, 10000L, 6, 10));

		// GeneticAlgorithmGenerator genetic = new
		// GeneticAlgorithmGenerator(reel);
		// System.out.println(genetic.generate(60L, 23, 0.9, 0.1, 0.1, 2));

		System.out.println("FINISH");
	}

}
