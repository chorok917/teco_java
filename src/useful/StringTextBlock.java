package useful;

public class StringTextBlock {

	public static void main(String[] args) {
		String strBlock0 = "  " + "aa" + "안녕"; // 여태까지 수업에서 문자열 쓰던 방법

		// """ 찍고 한 줄 내리기
		String strBlock = """
				This
				is
				Text
				block
				test.
				""";

		String a = """
				dddd
				""";

		String htmlText = """
				<!doctype html>
				<html dir="ltr" lang="ko"
				    chrome-refresh-2023>
				  <head>
				    <meta charset="utf-8">
				    <title>새 탭</title>
				    <style>
				      body {
				        background: #FFFFFF;
				        margin: 0;
				      }

				      #backgroundImage {
				        border: none;
				        height: 100%;
				        pointer-events: none;
				        position: fixed;
				        top: 0;
				        visibility: hidden;
				        width: 100%;
				      }

				      [show-background-image] #backgroundImage {
				        visibility: visible;
				      }
				    </style>
				  </head>
				  <body>
				    <iframe id="backgroundImage" src=""></iframe>
				    <ntp-app></ntp-app>
				    <script type="module" src="new_tab_page.js"></script>
				    <link rel="stylesheet" href="chrome://resources/css/text_defaults_md.css">
				    <link rel="stylesheet" href="chrome://theme/colors.css?sets=ui,chrome">
				    <link rel="stylesheet" href="shared_vars.css">
				  </body>
				</html>
								""";
		// html, json 문자열을 만드는데 유용하다

	}

}
