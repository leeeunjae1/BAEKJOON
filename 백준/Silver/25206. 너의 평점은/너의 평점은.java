import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Double avg = 0.0;
		Double sum = 0.0;
		Double totalCredits = 0.0;

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String subjectName = st.nextToken();
			Double subjectScore = Double.parseDouble(st.nextToken());
			String subjectValue = st.nextToken();

			if (!subjectValue.equals("P")) {
				Double subjectGrade = 0.0;
				
				switch (subjectValue) {
					case "A+":
						subjectGrade = 4.5;
						break;
					case "A0":
						subjectGrade = 4.0;
						break;
					case "B+":
						subjectGrade = 3.5;
						break;
					case "B0":
						subjectGrade = 3.0;
						break;
					case "C+":
						subjectGrade = 2.5;
						break;
					case "C0":
						subjectGrade = 2.0;
						break;
					case "D+":
						subjectGrade = 1.5;
						break;
					case "D0":
						subjectGrade = 1.0;
						break;
					case "F":
						subjectGrade = 0.0;
						break;
				}
				
				sum = sum +  subjectScore * subjectGrade;
				totalCredits = totalCredits + subjectScore;
			}
		}

		avg = sum / totalCredits;
		bw.write(String.format("%.6f\n", avg));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
