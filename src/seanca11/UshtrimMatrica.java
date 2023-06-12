package seanca11;

public class UshtrimMatrica {

	// krijo nje matrice qe ruan reviewt per 3 filma te ndryshem nga 5 profesioniste

	// 1. printoni reviewn per secilin film
	// 2. ruaj ne nje array 1d reviewn totale per secilin film
	// TODO 3. printoni filmin qe ka me shume review (index)

	/**
	 * Krijimi i matrices qe do ruaj reviewt per secilin film
	 * 
	 * @return reviewt
	 */
	public static int[][] merrReview() {

		// krijoj matricen qe do ruaj reviewt per tre filma

		int[][] review = { { 2, 3, 1, 5, 2 }, { 0, 4, 2, 8, 3 }, { 2, 4, 1, 0, 10 } };

		// TODO perdorni klasen Scanner per te lexuar reviewt nga perdoruesi
		// KUJDES! Review nuk duhet te jete < 0 dhe > 10

		return review;
	}

	/**
	 * printimi i review-ve
	 */
	public static void printoReview(int[][] review) {

		// printoj reviewt per secilin film

		// filloj iterimin e secilit rresht(te filmave)
		for (int indexFilmi = 0; indexFilmi < review.length; indexFilmi++) {
			System.out.println("Reviewt qe jane bere per filmin 'Filmi" + (indexFilmi + 1) + "' jane:");
			// filloj iterimin e seciles kolone(te profesionisteve)
			for (int indexProfesionist = 0; indexProfesionist < review[indexFilmi].length; indexProfesionist++) {

				System.out.print(review[indexFilmi][indexProfesionist] + " | ");
			}

			System.out.println("");
		}
	}

	public static int[] merrReviewTotalePerFilm(int[][] review) {

		// krijoj array1d qe do ruaj totalin e review per cdo film

		int[] arrayReviewTotal = new int[review.length];

		for (int indexFilmi = 0; indexFilmi < review.length; indexFilmi++) {
			int total = 0;
			// filloj iterimin e seciles kolone(te profesionisteve)
			for (int indexProfesionist = 0; indexProfesionist < review[indexFilmi].length; indexProfesionist++) {
				total = total + review[indexFilmi][indexProfesionist];
			}

			arrayReviewTotal[indexFilmi] = total;
		}

		return arrayReviewTotal;
	}

	public static void main(String[] args) {

		// therras metoden qe krijon matricen me reviewt e dhena
		int[][] review = merrReview();
		printoReview(review);

		int[] reviewTotalePerFilm = merrReviewTotalePerFilm(review);

		for (int indexFilmi = 0; indexFilmi < reviewTotalePerFilm.length; indexFilmi++) {
			System.out.println(
					"Review per filmin 'Filmin " + (indexFilmi + 1) + "' eshte " + reviewTotalePerFilm[indexFilmi]);
		}

	}

}
