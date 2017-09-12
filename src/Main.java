/**
 * Application single entry point class.
 * 
 * @author Todor Balabanov
 */
public class Main {

	/**
	 * Application single entry point method.
	 * 
	 * Run command example:
	 * 
	 * java -cp .:./bin Main >./bin/out.txt & disown
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("START");

		Reel reels[] = {

				new Reel(new String[] {

						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaab", "aaab", "aaab", "aaab", "aaab", "aaab", "aaab", "aaab", "aaab", "aaab",
						"aaab", "aaad", "aaad", "aaad", "aaad", "aaad", "aaad", "aaad", "aaad", "aaad", "aaad", "aaad",
						"aaad", "aaad", "aaad", "aaam", "aaam", "aaam", "aaam", "aaam", "aaam", "aaam", "aaam", "aaam",
						"aaam", "aaam", "aaam", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb",
						"aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aadc", "aadc", "aadc", "aadc",
						"aadc", "aadc", "aadc", "aadc", "aadc", "aadc", "aadc", "aamm", "aamm", "aamm", "aamm", "aamm",
						"aamm", "aamm", "aamm", "aann", "aann", "aann", "aann", "aann", "aann", "aann", "aann", "aann",
						"aann", "aann", "aann", "aann", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb",
						"abbb", "abbb", "abbb", "adcc", "adcc", "adcc", "adcc", "adcc", "adcc", "adcc", "adcc", "adcc",
						"ammn", "ammn", "ammn", "ammn", "ammn", "ammn", "ammn", "ammn", "ammn", "ammn", "ammn", "ammn",
						"ammn", "ammn", "ammn", "ammn", "annn", "annn", "annn", "annn", "annn", "annn", "annn", "annn",
						"annn", "annn", "annn", "annn", "annn", "annn", "annn", "annn", "annn", "annn", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbd", "bbbd",
						"bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd",
						"bbbd", "bbbd", "bbdc", "bbdc", "bbdc", "bbdc", "bbdc", "bbdc", "bbdc", "bbdc", "bbdc", "bbdc",
						"bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg", "bbdg",
						"bbdg", "bbdg", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc",
						"bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc", "bdcc",
						"bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg", "bdgg",
						"bdgg", "bdgg", "bdgg", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa",
						"caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa", "caaa",
						"caaa", "caaa", "caaa", "caaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa",
						"ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa",
						"ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccaa",
						"ccaa", "ccaa", "ccaa", "ccaa", "ccaa", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca",
						"ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "ccca", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm",
						"ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm", "ccmm",
						"ccnn", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm",
						"cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm", "cmmm",
						"daan", "daan", "daan", "daan", "daan", "daan", "daan", "daan", "daan", "daan", "daan", "daan",
						"daan", "daan", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccm",
						"dccm", "dccm", "dccm", "dccm", "dccm", "dccm", "dccm", "dccm", "dccm", "dccm", "dccm", "dccm",
						"dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg",
						"dggg", "dggg", "dggg", "dggg", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm",
						"gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm", "gccm",
						"ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "ggcc", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggn", "gggn", "gggn", "gggn", "gggn", "gggn", "gggn", "gggn", "gggp", "gggp",
						"gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "ggnn", "ggnn", "ggnn",
						"ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp",
						"gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp", "gnnp",
						"gppa", "gppa", "gppa", "gppa", "gppa", "gppa", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa",
						"mdaa", "mdaa", "mdaa", "mdaa", "mggg", "mggg", "mggg", "mggg", "mggg", "mggg", "mggg", "mggg",
						"mggg", "mggg", "mggg", "mggg", "mggg", "mggg", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda",
						"mmda", "mmda", "mmda", "mmda", "mmda", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg",
						"mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg", "mmgg",
						"mmgg", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd",
						"mmmd", "mmmg", "mmmg", "mmmg", "mmmg", "mmmg", "mmmg", "mmmg", "mmmg", "mmmg", "mmmg", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmnn", "mmnn", "mmnn", "mmnn", "mmnn",
						"mmnn", "mmnn", "mmnn", "mnnn", "mnnn", "mnnn", "mnnn", "mnnn", "mnnn", "mnnn", "mnnn", "mnnn",
						"mnnn", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd", "nbbd",
						"nbbd", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb",
						"nnbb", "nnbb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp",
						"nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp",
						"nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp",
						"nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp",
						"nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nppp", "nppp", "nppp",
						"nppp", "nppp", "nppp", "nppp", "nppp", "nppp", "npps", "npps", "npps", "npps", "npps", "npps",
						"npps", "npps", "npps", "npps", "npps", "npps", "npps", "paaa", "paaa", "paaa", "paaa", "paaa",
						"paaa", "paaa", "paaa", "paaa", "paaa", "paaa", "paaa", "paaa", "paaa", "paaa", "paaa", "paaa",
						"paaa", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc",
						"pccc", "pccc", "pccc", "pccc", "pggc", "pggc", "pggc", "pggc", "pggc", "pggc", "pggc", "pggc",
						"pggc", "pggc", "pggc", "pggc", "ppaa", "ppaa", "ppaa", "ppaa", "ppaa", "ppaa", "ppaa", "ppaa",
						"ppaa", "ppaa", "ppaa", "ppaa", "ppaa", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc",
						"ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppgg", "ppgg", "ppgg",
						"ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "pppc", "pppc",
						"pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc",
						"pppc", "pppc", "pppc", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg",
						"pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "ppss", "ppss",
						"ppss", "ppss", "ppss", "ppss", "ppss", "ppss", "ppss", "ppss", "ppss", "ppss", "ppss", "ppss",
						"ppss", "psss", "psss", "psss", "psss", "psss", "psss", "psss", "psss", "psss", "psss", "psss",
						"psss", "psss", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp",
						"sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sppp", "sspp", "sspp", "sspp", "sspp",
						"sspp", "sspp", "sspp", "sspp", "sspp", "sspp", "sspp", "sspp", "sspp", "sspp", "sspp", "sssp",
						"sssp", "sssp", "sssp", "sssp", "sssp", "sssp", "sssp", "sssp", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss",

				},

						"ssss",

						"ssss",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

						"aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap",
						"aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aaap", "aapp", "aapp",
						"aapp", "aapp", "aapp", "aapp", "appp", "appp", "appp", "appp", "appp", "appp", "appp", "appp",
						"appp", "appp", "appp", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp",
						"bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp", "bbbp",
						"bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp",
						"bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bbpp", "bppp",
						"bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp",
						"bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp",
						"bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "bppp", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd",
						"cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd",
						"cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd",
						"cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccs", "cccs", "cccs",
						"cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs",
						"cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs", "cccs",
						"cccs", "cccs", "cccs", "cccs", "ccda", "ccda", "ccda", "ccda", "ccda", "ccda", "ccda", "ccda",
						"ccda", "ccda", "ccda", "ccda", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg",
						"ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccdg", "ccss", "ccss",
						"ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss",
						"ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss",
						"ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "ccss", "cdaa", "cdaa", "cdaa",
						"cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa", "cdaa",
						"cdaa", "cdaa", "cdgg", "cdgg", "cdgg", "cdgg", "cdgg", "cdgg", "cdgg", "cdgg", "cdgg", "cdgg",
						"cdgg", "cdgg", "cdgg", "cdgg", "cdgg", "cssg", "cssg", "cssg", "cssg", "cssg", "cssg", "cssg",
						"cssg", "cssg", "cssg", "cssg", "cssg", "csss", "csss", "csss", "csss", "csss", "csss", "csss",
						"csss", "csss", "csss", "csss", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa",
						"daaa", "daaa", "daaa", "daaa", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc",
						"dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc",
						"dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dccc", "dggg", "dggg", "dggg", "dggg",
						"dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "gbbb", "gbbb", "gbbb", "gbbb",
						"gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb",
						"gbbb", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp", "gbbp",
						"gbbp", "gbbp", "gbbp", "gbbp", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb",
						"ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb",
						"ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "gggb", "gggb", "gggb", "gggb",
						"gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb",
						"gggb", "gggb", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp",
						"ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "gppp", "gppp", "gppp", "gppp", "gppp",
						"gppp", "gppp", "gppp", "gppp", "gppp", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmn", "mmmw", "mmmw", "mmmw", "mmmw",
						"mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmmw", "mmww",
						"mmww", "mmww", "mmww", "mmww", "mmww", "mmww", "mmww", "mmww", "mmww", "mmww", "mmww", "mwww",
						"mwww", "mwww", "mwww", "mwww", "mwww", "mwww", "mwww", "mwww", "mwww", "mwww", "mwww", "mwww",
						"mwww", "mwww", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc",
						"ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "ndcc", "nndc", "nndc", "nndc", "nndc", "nndc",
						"nndc", "nndc", "nndc", "nndc", "nndc", "nndc", "nndc", "nndc", "nndc", "nndc", "nndc", "nndc",
						"nndc", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd", "nnnd",
						"nnnd", "nnnd", "nnnd", "nnnd", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "pdcc", "pdcc", "pdcc", "pdcc", "pdcc", "pdcc",
						"pdcc", "pdcc", "pdcc", "pdcc", "pdcc", "pdcc", "pdcc", "pdcc", "pdcc", "pggb", "pggb", "pggb",
						"pggb", "pggb", "pggb", "pggb", "pggb", "pggb", "pggb", "pggb", "pggb", "pggb", "pggb", "pggb",
						"pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm",
						"pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pnnn", "pnnn", "pnnn", "pnnn",
						"pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "pnnn", "ppdc",
						"ppdc", "ppdc", "ppdc", "ppdc", "ppdc", "ppdc", "ppdc", "ppdc", "ppdc", "ppdc", "ppgg", "ppgg",
						"ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg",
						"ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppmm", "ppmm", "ppmm",
						"ppmm", "ppmm", "ppmm", "ppmm", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn",
						"ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn", "ppnn",
						"pppd", "pppd", "pppd", "pppd", "pppd", "pppd", "pppd", "pppd", "pppd", "pppd", "pppd", "pppd",
						"pppd", "pppd", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg",
						"pppg", "pppg", "pppg", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm",
						"pppm", "pppm", "pppn", "pppn", "pppn", "pppn", "pppn", "pppn", "pppn", "pppn", "pppn", "pppn",
						"pppn", "pppn", "pppn", "pppn", "pppn", "pppn", "pppn", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "sccc", "sccc", "sccc",
						"sccc", "sccc", "sccc", "sccc", "sccc", "sccc", "sccc", "sccc", "sccc", "sccc", "sccc", "sccc",
						"sccc", "sccc", "sccc", "sggp", "sggp", "sggp", "sggp", "sggp", "sggp", "sggp", "sggp", "sggp",
						"sggp", "sggp", "sggp", "sggp", "sggp", "sggp", "sggp", "sggp", "sscc", "sscc", "sscc", "sscc",
						"sscc", "sscc", "sscc", "sscc", "sscc", "sscc", "sscc", "sscc", "sscc", "sscc", "sscc", "sscc",
						"ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "sssc", "sssc", "sssc", "sssc", "sssc",
						"sssc", "sssc", "sssc", "sssc", "sssc", "sssc", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "wccc", "wccc", "wccc",
						"wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc",
						"wccc", "wccc", "wccc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc",
						"wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc",
						"wwwc", "wwwc", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww",

				},

						"ssss",

						"ssss",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaac", "aaac", "aaac", "aaac",
						"aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac",
						"aaac", "aaac", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag",
						"aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag", "aaag",
						"aaag", "aaag", "aaag", "aaag", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas",
						"aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas",
						"aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas",
						"aaas", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc",
						"aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aagg", "aagg", "aagg",
						"aagg", "aagg", "aagg", "aagg", "aagg", "aagg", "aagg", "aagg", "aagg", "aagg", "aagg", "aagg",
						"aagg", "aagg", "aagg", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass",
						"aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass",
						"aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass",
						"aass", "aass", "aass", "aass", "accc", "accc", "accc", "accc", "accc", "accc", "accc", "accc",
						"accc", "accc", "accc", "accc", "accc", "accc", "accc", "accc", "accc", "accc", "aggg", "aggg",
						"aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg",
						"aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "aggg", "asss", "asss",
						"asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss",
						"asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss",
						"asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "baaa", "baaa",
						"baaa", "baaa", "baaa", "baaa", "baaa", "baaa", "baaa", "baaa", "baaa", "baaa", "baaa", "baaa",
						"bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa",
						"bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbaa", "bbba", "bbba", "bbba", "bbba", "bbba", "bbba",
						"bbba", "bbba", "bbba", "bbba", "bbba", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbd",
						"bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd", "bbbd",
						"bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn", "bbdn",
						"bbdn", "bbdn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn",
						"bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "bdnn", "cbbb", "cbbb",
						"cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb",
						"cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "ccbb", "ccbb",
						"ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb",
						"ccbb", "ccbb", "ccbb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb",
						"cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb", "cccb",
						"daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa", "daaa",
						"daaa", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn",
						"gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa",
						"gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb",
						"gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "ggaa",
						"ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa",
						"ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb",
						"ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb",
						"gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb",
						"gggb", "gggb", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp",
						"gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "gggp", "ggpp", "ggpp", "ggpp",
						"ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "ggpp", "gppp",
						"gppp", "gppp", "gppp", "gppp", "gppp", "gppp", "gppp", "gppp", "gppp", "gppp", "gppp", "gppp",
						"gppp", "gppp", "gppp", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa", "mdaa",
						"mdaa", "mdaa", "mdaa", "mdaa", "mdaa", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda",
						"mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda", "mmda",
						"mmda", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd",
						"mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw",
						"nnnw", "nnnw", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww",
						"nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww",
						"nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww",
						"nwww", "nwww", "nwww", "nwww", "nwww", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm", "pmmm",
						"pmmm", "pmmm", "pmmm", "pmmm", "ppmm", "ppmm", "ppmm", "ppmm", "ppmm", "ppmm", "ppmm", "ppmm",
						"ppmm", "ppmm", "ppmm", "ppmm", "ppmm", "ppmm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm",
						"pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "pppm",
						"pppm", "pppm", "pppm", "pppm", "pppm", "pppm", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa",
						"saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa",
						"saaa", "saaa", "saaa", "saaa", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga",
						"sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga", "sgga",
						"sgga", "sgga", "sgga", "sgga", "sgga", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa",
						"ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssgg", "ssgg", "ssgg", "ssgg",
						"ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg", "ssgg",
						"ssgg", "ssgg", "ssgg", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa",
						"sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssg", "sssg",
						"sssg", "sssg", "sssg", "sssg", "sssg", "sssg", "sssg", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "wggg", "wggg", "wggg", "wggg", "wggg", "wggg", "wggg", "wggg", "wggg", "wggg",
						"wggg", "wggg", "wggg", "wggg", "wggg", "wggg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg",
						"wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg", "wwgg",
						"wwgg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg",
						"wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg", "wwwg",
						"wwwg", "wwwg", "wwwg", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww",

				},

						"ssss",

						"ssss",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaas", "aaas", "aaas", "aaas", "aaas",
						"aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas", "aaas",
						"aaas", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass", "aass",
						"aass", "aass", "aass", "aass", "asss", "asss", "asss", "asss", "asss", "asss", "asss", "asss",
						"asss", "asss", "asss", "asss", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbm", "bbbm", "bbbm",
						"bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm",
						"bbbm", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs", "bbbs",
						"bbbs", "bbbs", "bbbs", "bbbs", "bbbw", "bbbw", "bbbw", "bbbw", "bbbw", "bbbw", "bbbw", "bbmm",
						"bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm",
						"bbmm", "bbmm", "bbmm", "bbmm", "bbss", "bbss", "bbss", "bbss", "bbss", "bbss", "bbss", "bbss",
						"bbss", "bbss", "bbss", "bbss", "bbss", "bbss", "bbss", "bbss", "bbww", "bbww", "bbww", "bbww",
						"bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bbww",
						"bbww", "bbww", "bbww", "bbww", "bbww", "bbww", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm",
						"bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bnnc", "bsss", "bsss", "bsss",
						"bsss", "bsss", "bsss", "bsss", "bsss", "bsss", "bsss", "bsss", "bsss", "bsss", "bsss", "bsss",
						"bsss", "bwww", "bwww", "bwww", "bwww", "bwww", "bwww", "bwww", "bwww", "bwww", "bwww", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn",
						"cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn", "cccn",
						"cccn", "cccn", "ccnn", "ccnn", "ccnn", "ccnn", "ccnn", "ccnn", "ccnn", "ccnn", "ccnn", "ccnn",
						"ccnn", "ccnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn",
						"cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "cnnn", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg",
						"dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "dggg", "gaaa", "gaaa", "gaaa",
						"gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa", "gaaa",
						"gaaa", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb", "gbbb",
						"ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa", "ggaa",
						"ggaa", "ggaa", "ggaa", "ggaa", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb", "ggbb",
						"ggbb", "ggbb", "ggbb", "ggbb", "ggga", "ggga", "ggga", "ggga", "ggga", "ggga", "ggga", "ggga",
						"ggga", "ggga", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggb",
						"gggb", "gggb", "gggb", "gggb", "gggb", "gggb", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "mdgg", "mdgg", "mdgg", "mdgg", "mdgg", "mdgg", "mdgg", "mdgg",
						"mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg", "mmdg",
						"mmdg", "mmdg", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd", "mmmd",
						"mmmd", "mmmd", "mmmd", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp",
						"mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp",
						"mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mppp", "mppp", "mppp", "mppp", "mppp",
						"mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "nbbb", "nbbb",
						"nbbb", "nbbb", "nbbb", "nbbb", "nbbb", "nbbb", "nbbb", "nbbb", "nbbb", "nbbb", "nnbb", "nnbb",
						"nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb", "nnbb",
						"nnbb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb", "nnnb",
						"nnnb", "nnnb", "nnnb", "nnnb", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw",
						"nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnnw", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww",
						"nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nnww", "nwww", "nwww", "nwww",
						"nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "nwww", "pggg", "pggg", "pggg",
						"pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "ppgg", "ppgg",
						"ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "pppg", "pppg",
						"pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg", "pppg",
						"pppg", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "pppp", "pppp", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb",
						"sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "snnn", "snnn", "snnn", "snnn",
						"snnn", "snnn", "snnn", "snnn", "snnn", "snnn", "snnn", "snnn", "snnn", "ssbb", "ssbb", "ssbb",
						"ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssnn", "ssnn", "ssnn",
						"ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn",
						"ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "ssnn", "sssb", "sssb", "sssb", "sssb", "sssb",
						"sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb",
						"sssn", "sssn", "sssn", "sssn", "sssn", "sssn", "sssn", "sssn", "sssn", "sssn", "sssn", "sssn",
						"sssn", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "wccc",
						"wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc", "wccc",
						"wccc", "wccc", "wmmm", "wmmm", "wmmm", "wmmm", "wmmm", "wmmm", "wmmm", "wmmm", "wmmm", "wmmm",
						"wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc", "wwcc",
						"wwcc", "wwcc", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm",
						"wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwmm", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc",
						"wwwc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwc", "wwwm", "wwwm", "wwwm", "wwwm",
						"wwwm", "wwwm", "wwwm", "wwwm", "wwwm", "wwwm", "wwwm", "wwwm", "wwwm", "wwwm", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww", "wwww",
						"wwww",

				},

						"ssss",

						"ssss",

						new String[] {},

						50, 150

				),

				new Reel(new String[] {

						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
						"aaaa", "aaaa", "aaaa", "aaaa", "aaaa", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac", "aaac",
						"aaac", "aaac", "aaac", "aaac", "aaac", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb", "aabb",
						"aabb", "aabb", "aabb", "aabb", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc",
						"aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "aacc", "abbb",
						"abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb", "abbb",
						"abbb", "accb", "accb", "accb", "accb", "accb", "accb", "accb", "accb", "accb", "accb", "accb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb",
						"bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbb", "bbbg",
						"bbbg", "bbbg", "bbbg", "bbbg", "bbbg", "bbbg", "bbbg", "bbbg", "bbbg", "bbbm", "bbbm", "bbbm",
						"bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbm", "bbbn", "bbbn", "bbbn", "bbbn", "bbbn",
						"bbbn", "bbbn", "bbbn", "bbbn", "bbbn", "bbbn", "bbgg", "bbgg", "bbgg", "bbgg", "bbgg", "bbgg",
						"bbgg", "bbgg", "bbgg", "bbgg", "bbgg", "bbgg", "bbgg", "bbgg", "bbmm", "bbmm", "bbmm", "bbmm",
						"bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbmm", "bbnn", "bbnn", "bbnn",
						"bbnn", "bbnn", "bbnn", "bbnn", "bbnn", "bbnn", "bbnn", "bbnn", "bbnn", "bbnn", "bggg", "bggg",
						"bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg",
						"bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bggg", "bmmm", "bmmm", "bmmm", "bmmm",
						"bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bmmm", "bnnn", "bnnn", "bnnn", "bnnn", "bnnn",
						"bnnn", "bnnn", "bnnn", "bnnn", "bnnn", "bnnn", "bnnn", "bnnn", "cbbb", "cbbb", "cbbb", "cbbb",
						"cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "cbbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb",
						"ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "ccbb", "cccc", "cccc", "cccc", "cccc",
						"cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccc", "cccd", "cccd",
						"cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "cccd", "ccdn",
						"ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn", "ccdn",
						"ccdn", "ccdn", "ccdn", "cdnn", "cdnn", "cdnn", "cdnn", "cdnn", "cdnn", "dnnn", "dnnn", "dnnn",
						"dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "dnnn", "ggga", "ggga", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg",
						"gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggg", "gggs", "gggs", "gggs", "gggs",
						"gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs",
						"gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "gggs", "ggmm", "ggmm", "ggmm",
						"ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm", "ggmm",
						"ggmm", "ggmm", "ggmm", "ggmm", "ggnn", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss",
						"ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss",
						"ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss", "ggss",
						"ggss", "ggss", "ggss", "gmmm", "gmmm", "gmmm", "gmmm", "gmmm", "gmmm", "gmmm", "gmmm", "gmmm",
						"gmmm", "gmmm", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss",
						"gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "gsss",
						"gsss", "gsss", "gsss", "gsss", "gsss", "gsss", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm",
						"mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmm", "mmmn", "mmmp", "mmmp", "mmmp",
						"mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmmp", "mmms",
						"mmms", "mmms", "mmms", "mmms", "mmms", "mmms", "mmms", "mmms", "mmms", "mmms", "mmms", "mmms",
						"mmms", "mmms", "mmms", "mmms", "mmms", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp",
						"mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mmpp", "mmss", "mmss", "mmss", "mmss", "mmss", "mmss",
						"mmss", "mmss", "mmss", "mmss", "mmss", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp",
						"mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp", "mppp",
						"msss", "msss", "msss", "msss", "msss", "msss", "msss", "msss", "msss", "msss", "msss", "msss",
						"msss", "msss", "msss", "msss", "msss", "msss", "msss", "nggm", "nggm", "nggm", "nggm", "nggm",
						"nggm", "nggm", "nggm", "nggm", "nggm", "nggm", "nggm", "nggm", "nggm", "nmmm", "nngg", "nngg",
						"nngg", "nngg", "nngg", "nngg", "nngg", "nngg", "nngg", "nngg", "nngg", "nngg", "nnng", "nnng",
						"nnng", "nnng", "nnng", "nnng", "nnng", "nnng", "nnng", "nnng", "nnng", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn",
						"nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnn", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp",
						"nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnnp", "nnpp", "nnpp", "nnpp",
						"nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nnpp", "nppg", "nppg", "nppg", "nppg",
						"nppg", "nppg", "nppg", "nppg", "nppg", "nppg", "nppg", "nsss", "pccc", "pccc", "pccc", "pccc",
						"pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pccc", "pggg", "pggg", "pggg",
						"pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg", "pggg",
						"ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc", "ppcc",
						"ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "ppgg",
						"ppgg", "ppgg", "ppgg", "ppgg", "ppgg", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc",
						"pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppc", "pppp", "pppp",
						"pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp", "pppp",
						"pppp", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa",
						"saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saaa", "saab", "saab", "saab", "saab", "saab",
						"saab", "saab", "saab", "saab", "saab", "saab", "saab", "saab", "saab", "sbbb", "sbbb", "sbbb",
						"sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "sbbb", "ssaa", "ssaa", "ssaa",
						"ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa",
						"ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa",
						"ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssaa", "ssbb", "ssbb",
						"ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "ssbb", "sssa", "sssa",
						"sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa",
						"sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa", "sssa",
						"sssa", "sssa", "sssa", "sssa", "sssa", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb",
						"sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb", "sssb",
						"sssb", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss", "ssss",
						"ssss",

				},

						"ssss",

						"ssss",

						new String[] {},

						50, 150

				),

		};

		/*
		 * For single solution checking.
		 */ {
			Reel reel = reels[0];
			String solution = "";
			// String[] wrong = reel.wrongSegments(solution);
			// String[] missing = reel.missingObservations(solution);
			// String[] repeats = reel.repeatingSegments(solution);
			// System.out.println(wrong.length + "\t" + missing.length + "\t" +
			// repeats.length + "\t"
			// + reel.distance(solution) + "\t" + solution.length() + "\t" +
			// solution + "\t"
			// + Arrays.toString(wrong) + "\t" + Arrays.toString(missing) + "\t"
			// + Arrays.toString(repeats));
		}

		/*
		 * Generate all reels.
		 */
		for (int r = 0; r < reels.length; r++) {
			System.out.println("REEL " + (r + 1));

			/*
			 * Just point the reference.
			 */
			Reel reel = reels[r];

			System.out.println(reel.observations());
			System.out.println(reel.neighbors());

			/*
			 * Monte-Carlo search based optimization.
			 */
			MonteCarloGenerator monte = new MonteCarloGenerator(reel);
			System.out.println(monte.generate(100000000L, 10000L, 6, 10));
		}

		/*
		 * Genetic algorithm based optimization.
		 */
		// GeneticAlgorithmGenerator genetic = new
		// GeneticAlgorithmGenerator(reel);
		// System.out.println(genetic.generate(60L, 23, 0.9, 0.1, 0.1, 2));

		System.out.println("FINISH");
	}

}
