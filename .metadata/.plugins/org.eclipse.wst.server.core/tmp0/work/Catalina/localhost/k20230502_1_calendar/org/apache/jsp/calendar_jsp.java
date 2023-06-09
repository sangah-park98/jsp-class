/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-03 00:01:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.util.Date;
import com.tjoeun.myCalendar.MyCalendar;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("com.tjoeun.myCalendar.MyCalendar");
    _jspx_imports_classes.add("java.util.Date");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>만년 달력</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("	table{\r\n");
      out.write("		/* border: 선두께 선종류 선색상 */\r\n");
      out.write("		border: 0px solid;\r\n");
      out.write("	}\r\n");
      out.write("	tr {\r\n");
      out.write("		height: 70px;\r\n");
      out.write("		border-width: 0px;\r\n");
      out.write("		font-family: SB 어그로;\r\n");
      out.write("	}\r\n");
      out.write("	th {\r\n");
      out.write("		font-size: 16pt;\r\n");
      out.write("		width: 100px;\r\n");
      out.write("		border: 1px solid black;\r\n");
      out.write("	}\r\n");
      out.write("	th#title {\r\n");
      out.write("		font-size: 20pt; /* 글꼴 크기 */\r\n");
      out.write("		font-weight: bold; /* 글꼴 두께 */\r\n");
      out.write("		color: grey;\r\n");
      out.write("	}\r\n");
      out.write("	th#sunday {\r\n");
      out.write("		color: Crimson;\r\n");
      out.write("	}\r\n");
      out.write("	th#saturday {\r\n");
      out.write("		color: blue;\r\n");
      out.write("	}\r\n");
      out.write("	td {\r\n");
      out.write("		text-align: right; /* 수평 정렬 */\r\n");
      out.write("		vertical-align: top; /* 수직 정렬 top, middle, bottom */\r\n");
      out.write("		border: 1px solid black;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	td.sun {\r\n");
      out.write("		color: Crimson;\r\n");
      out.write("	}\r\n");
      out.write("	td.sat {\r\n");
      out.write("		color: blue;\r\n");
      out.write("	}\r\n");
      out.write("	td#beforesun {\r\n");
      out.write("		color: Crimson;\r\n");
      out.write("		font-size: 10pt;\r\n");
      out.write("		background-color: lavender;\r\n");
      out.write("	}\r\n");
      out.write("	td.before {\r\n");
      out.write("		font-size: 10pt;\r\n");
      out.write("		background-color: lavender;\r\n");
      out.write("	}\r\n");
      out.write("	td#aftersat {\r\n");
      out.write("		color: blue;\r\n");
      out.write("		font-size: 10pt;\r\n");
      out.write("		background-color: lavender;\r\n");
      out.write("	}\r\n");
      out.write("	td.after {\r\n");
      out.write("		font-size: 10pt;\r\n");
      out.write("		background-color: lavender;\r\n");
      out.write("	}\r\n");
      out.write("	td#choice {\r\n");
      out.write("		text-align: left;\r\n");
      out.write("		vertical-align: middle;\r\n");
      out.write("	}\r\n");
      out.write("	td.holiday {\r\n");
      out.write("		color: red;\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("	td.star {\r\n");
      out.write("		color: DeepPink;\r\n");
      out.write("		background-color: white;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("	}\r\n");
      out.write("	span {\r\n");
      out.write("		font-size: 8pt;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	/*\r\n");
      out.write("	하이퍼링크 스타일 지정하기\r\n");
      out.write("	link: 1번도 클릭하지 않은 하이퍼링크\r\n");
      out.write("	visited: 1번 이상 클릭한 하이퍼링크\r\n");
      out.write("	hover: 하이퍼링크에 마우스를 올리고 있을 때\r\n");
      out.write("	active: 하이퍼링크를 마우스로 누르고 있을 때\r\n");
      out.write("	 \r\n");
      out.write("	 a:link {\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("	}\r\n");
      out.write("	 a:visited {\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("	}\r\n");
      out.write("	  a:link, a:visited {\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("	}\r\n");
      out.write("	 */\r\n");
      out.write("	  a {\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-decoration: none; /* 밑줄 */\r\n");
      out.write("	}\r\n");
      out.write("	  a:hover {\r\n");
      out.write("		color: blue;\r\n");
      out.write("		text-decoration: underline; \r\n");
      out.write("	}\r\n");
      out.write("	  a:active {\r\n");
      out.write("		color: dodgerblue;\r\n");
      out.write("		text-decoration: underline; \r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.button {background-color: #8B008B; font-family: SB 어그로; border: none; color: white;\r\n");
      out.write("     padding: 4px 4px; text-align: center; text-decoration: none; display: inline-block;\r\n");
      out.write("     font-size: 12px; margin: 2px 2px; transition-duration: 0.4s; cursor: pointer;}\r\n");
      out.write("   .button1 {background-color: white; color: black; border: 2px solid #8B008B;}\r\n");
      out.write("   .button1:hover {background-color: #8B008B; color: white;}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	.select {\r\n");
      out.write("		width: 100px;\r\n");
      out.write("		height: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	fieldset {\r\n");
      out.write("		width: 105px;\r\n");
      out.write("		display: inline;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

//	달력 메소드 테스트
//	out.println(MyCalendar.isLeapYear(2023));
//	out.println(MyCalendar.lastDay(2024, 2));
//	out.println(MyCalendar.totalDay(2023, 2, 28));
//	out.println(MyCalendar.weekDay(2023, 2, 28));
	
// 	컴퓨터 시스템의 년, 월을 얻어온다.
//	Date date = new Date();
//	int year = date.getYear()+ 1900;
//	int month = date.getMonth() +1;
//	out.println(year +"년 " + month + "월 ");

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH) +1;
//	out.println(year +"년 " + month + "월 ");
	
//		이전달, 다음달 하이퍼링크 또는 버튼을 클릭하면 get 방식으로 넘어오는 달력을 출력할 년, 월을 받는다.
//		달력이 최초로 실행되면 이전 페이지가 존재하지 않기 때문에 넘어오는 데이터가 없으므로 year와 month가
//		null이므로 NumberFormatException이 발생된다. => 예외처리를 해야 한다.
		try {
			year = Integer.parseInt(request.getParameter("year"));
			month = Integer.parseInt(request.getParameter("month"));
			
			// month에 13이 넘어왔으면 달력에는 다음해 1월을 표시해야 하고, month에 0이 넘어왔으면 달력에는
			// 전년도 12월을 표시해야 한다.
			if(month <= 0){
				year--;
				month = 12;
			} else if(month >= 13){
				year++;
				month = 1;
			}
		} 
		catch(NumberFormatException e){
		
		}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"700\" border=\"1\" align=\"center\" cellpadding=\"5\" cellspacing=\"2\" >\r\n");
      out.write("	<tr>\r\n");
      out.write("		<th>\r\n");
      out.write("			<!-- \r\n");
      out.write("			<a> 태그가 설정된 문자열을 클릭하면 href 속성에 지정된 곳으로 이동한다.\r\n");
      out.write("			href 속성의 \"#\"뒤에 id(해시)를 지정하면 현재 문서에서 id가 지정된 요소로 이동(책갈피)하고\r\n");
      out.write("			url(주소)이 지정되면 지정된 url로 페이지를 이동한다.\r\n");
      out.write("			\"?\"뒤에 이동하는 페이지로 전달할 데이터를 넘겨주는데 이때 넘겨줄 데이터가 2건 이상이라면\r\n");
      out.write("			데이터와 데이터 사이에 \"&\"를 넣어서 구분한다.\r\n");
      out.write("			\"?\"뒤에는 절대로 띄어쓰기를 하면 안된다.	\r\n");
      out.write("		 	-->	\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<input class=\"button button1\"\r\n");
      out.write("				   type=\"button\" \r\n");
      out.write("				   value=\"◀\" \r\n");
      out.write("				   onclick=\"location.href='?year=");
      out.print(year);
      out.write("&month=");
      out.print(month-1);
      out.write("'\"> 	\r\n");
      out.write("		</th>\r\n");
      out.write("		<th id=\"title\" colspan=\"5\"> \r\n");
      out.write("			");
      out.print(year);
      out.write('년');
      out.write(' ');
      out.print(month);
      out.write("월\r\n");
      out.write("		</th>\r\n");
      out.write("		<th>\r\n");
      out.write("			");
      out.write("	\r\n");
      out.write("			<button class=\"button button1\"\r\n");
      out.write("			type=\"button\"\r\n");
      out.write("			onclick=\"location.href='?year=");
      out.print(year);
      out.write("&month=");
      out.print(month+1);
      out.write("'\"> 	\r\n");
      out.write("			  ▶\r\n");
      out.write("			</button>\r\n");
      out.write("			\r\n");
      out.write("		</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th id=\"sunday\">일</th>\r\n");
      out.write("		<th>월</th>\r\n");
      out.write("		<th>화</th>\r\n");
      out.write("		<th>수</th>\r\n");
      out.write("		<th>목</th>\r\n");
      out.write("		<th>금</th>\r\n");
      out.write("		<th id=\"saturday\">토</th>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- 달력에 날짜를 출력한다. -->\r\n");
      out.write("	<tr>\r\n");

	int last = MyCalendar.lastDay(year, month);

//	1일이 출력될 위치(요일)를 맞추기 위해 달력을 출력할 달 1일의 요일만큼 반복하며 빈칸을 출력한다.
//	for(int i=1; i<=MyCalendar.weekDay(year, month, 1); i++){
//			out.println("<td></td>");
//	}

//	빈칸에 출력할 전달 날짜의 시작일을 계산한다.
	int week = MyCalendar.weekDay(year, month, 1);
	int start = 0;
	if(month ==1){
		start = 31 - week;
	} else {
		start = MyCalendar.lastDay(year, month-1) - week;
	}
//	1일이 출력될 위치(요일)를 맞추기 위해 달력을 출력할 달 1일의 요일만큼 반복하며 전달 날짜를 출력한다.
	for(int i=0; i<week; i++){
		if(i==0){ // 일요일?
		out.println("<td id='beforesun'>" +(month ==1 ? 12: month-1)+ "/" + ++start + "</td>");
		} else {
		out.println("<td class='before'>" +(month ==1 ? 12: month-1)+ "/" + ++start + "</td>");
		}
	}

	
	
//	1일부터 달력을 출력할 달의 마지막 날짜까지 반복하며 날짜를 출력한다.
	for(int i=1; i<=MyCalendar.lastDay(year, month); i++){
	// 삼일절, 어린이날, 광복절, 개천절, 한글날, 설날, 추석, 석가탄신일이 토요일 또는
	// 일요일과 겹치는 경우 그 다음 첫번째 비공휴일을 대체 공휴일로 한다.	
	boolean flag0301 = false;
	int subHoliday0301 = 0;
	if(MyCalendar.weekDay(year, 3, 1)==6){
		flag0301 = true;
		subHoliday0301 =3; // 3월 3일
	} else if(MyCalendar.weekDay(year, 3, 1)==0){
		flag0301 = true;
		subHoliday0301 = 2; // 3월 2일
	}
	
	boolean flag0501 = false;
	int subHoliday0501 = 0;
	if(MyCalendar.weekDay(year, 5, 1)==6){
		flag0501 = true;
		subHoliday0501 =3; 
	} else if(MyCalendar.weekDay(year, 5, 1)==0){
		flag0501 = true;
		subHoliday0501 = 2; 
	}
	boolean flag0505 = false;
	int subHoliday0505 = 0;
	if(MyCalendar.weekDay(year, 5, 5)==6){
		flag0505 = true;
		subHoliday0505 =7; 
	} else if(MyCalendar.weekDay(year, 5, 5)==0){
		flag0505 = true;
		subHoliday0505 = 6; 
	}
	boolean flag0606 = false;
	int subHoliday0606 = 0;
	if(MyCalendar.weekDay(year, 6, 6)==6){
		flag0606 = true;
		subHoliday0606 =8; 
	} else if(MyCalendar.weekDay(year, 6, 6)==0){
		flag0606 = true;
		subHoliday0606 = 7; 
	}
	boolean flag0815 = false;
	int subHoliday0815 = 0;
	if(MyCalendar.weekDay(year, 8, 15)==6){
		flag0815 = true;
		subHoliday0815 =17; 
	} else if(MyCalendar.weekDay(year, 8, 15)==0){
		flag0815 = true;
		subHoliday0815 = 16; 
	}
	boolean flag1003 = false;
	int subHoliday1003 = 0;
	if(MyCalendar.weekDay(year, 10, 3)==6){
		flag1003 = true;
		subHoliday1003 =5; 
	} else if(MyCalendar.weekDay(year, 10, 03)==0){
		flag1003 = true;
		subHoliday1003 = 4; 
	}
	
	boolean flag1009 = false;
	int subHoliday1009 = 0;
	if(MyCalendar.weekDay(year, 10, 9)==6){
		flag1009 = true;
		subHoliday1009 =11; 
	} else if(MyCalendar.weekDay(year, 10, 9)==0){
		flag1009 = true;
		subHoliday1009 = 10; 
	}
	boolean flag1225 = false;
	int subHoliday1225 = 0;
	if(MyCalendar.weekDay(year, 12, 25)==6){
		flag1225 = true;
		subHoliday1225 =27; 
	} else if(MyCalendar.weekDay(year, 12, 25)==0){
		flag1225 = true;
		subHoliday1225 = 26; 
	}
	
	
		// 양력 공휴일
		if(month ==1 && i==1){
			out.println("<td class='holiday'>" + i + "<br><span>신정</span></td>");
			
		} else if(month ==3 && i==1) {
			out.println("<td class='holiday'>" + i + "<br><span>삼일절</span></td>");
			
		} else if(month ==5 && i==1) {
			out.println("<td class='holiday'>" + i + "<br><span>근로자의 날</span></td>");
			
		} else if(month ==4 && i==10) {
			out.println("<td class='star'>" + i + "<br><span>♥내 생일♥</span></td>");
			
		} else if(month ==5 && i==5) {
			out.println("<td class='holiday'>" + i + "<br><span>어린이날</span></td>");
			
		} else if(month ==6 && i==6) {
			out.println("<td class='holiday'>" + i + "<br><span>현충일</span></td>");
			
		} else if(month ==8 && i==15){
			out.println("<td class='holiday'>" + i + "<br><span>광복절</span></td>");
			
		} else if(month ==10 && i==3){
			out.println("<td class='holiday'>" + i + "<br><span>개천절</span></td>");
			
		} else if(month ==10 && i==9){
			out.println("<td class='holiday'>" + i + "<br><span>한글날</span></td>");
			
		} else if(month ==12 && i==25){
			out.println("<td class='holiday'>" + i + "<br><span>크리스마스</span></td>");
		}
		
		// 대체 공휴일
		else if(flag0301 && month == 3 && i==subHoliday0301){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag0501 && month == 5 && i==subHoliday0501){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag0505 && month == 5 && i==subHoliday0505){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag0606 && month == 6 && i==subHoliday0606){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag0815 && month == 8 && i==subHoliday0815){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag1003 && month == 10 && i==subHoliday1003){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag1009 && month == 10 && i==subHoliday1009){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
		else if(flag1225 && month == 12 && i==subHoliday1225){
			out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
		}
	
		
		else { // 양력 공휴일을 제외한 나머지 날짜
			
		// <td> 태그에 요일에 따른 class 속성을 지정한다.
/* 		if(MyCalendar.weekDay(year, month, i)==0){ // 일요일?
			out.println("<td class='sun'>" + i + "</td>");
		} else if(MyCalendar.weekDay(year, month, i)==6){ // 토요일?
			out.println("<td class='sat'>" + i + "</td>");
		} else { // 평일?
			out.println("<td>" + i + "</td>");
		} */
			
		switch(MyCalendar.weekDay(year, month, i)) {
		case 0: // 일요일
			out.println("<td class='sun'>" + i + "</td>");
			break;
		case 6: // 토요일
			out.println("<td class='sat'>" + i + "</td>");
//		마지막 날이 토요일이고, 마지막 날이면 줄을 바꾸지 않는다.
			if(MyCalendar.weekDay(year, month, i)==6 && i==MyCalendar.lastDay(year, month)){
			} 
			break;
		default:
			out.println("<td>" + i + "</td>");
			break;
		
		}
	}

	 // 출력한 날짜(i)가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다.
    
    if (MyCalendar.weekDay(year, month, i) == 6 && i != MyCalendar.lastDay(year, month)) {
       out.println("</tr><tr>");
    }
 }


//	다음 달 1일의 요일을 계산한다.
	if(month==12){
		week = MyCalendar.weekDay(year+1, 1, 1); // 12월
	} else{
		week = MyCalendar.weekDay(year, month+1, 1); // 1~11월
	}
//	다음달 1일이 일요일이면 남는 빈칸이 없으므로 다음달 날짜를 출력할 필요가 없다.
	if(week !=0){
//	날짜를 다 출력하고 남은 빈칸에 다음 달 1일의 요일부터 토요일까지 반복하며 출력한다.
		start = 1;
		for(int i=week; i<=6; i++){
			if(i==6){
			out.println("<td id='aftersat'>" +(month ==12 ? 1: month+1)+ "/" + start++ + "</td>");
			} else{
			out.println("<td class='after'>" +(month ==12 ? 1: month+1)+ "/" + start++ + "</td>");
			}
		}	
	}

//	for(int i=0; i<6-MyCalendar.weekDay(year, month, last); i++){
//		out.println("<td>");
//		out.println("</td>");
//	}
	

      out.write("\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<!-- 년, 월을 선택하고 보기 버튼을 클릭하면 선택된 달의 달력으로 한 번에 넘어가게 한다. -->\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td id=\"choice\" colspan=\"7\">\r\n");
      out.write("      <form action=\"?\">\r\n");
      out.write("          <fieldset>\r\n");
      out.write("               <legend>년</legend>\r\n");
      out.write("            <select name=\"year\" class=\"select\">\r\n");

   for (int i=1900; i<=2100; i++) {
	   if(calendar.get(Calendar.YEAR)==i){
         out.println("<option selected='selected'>" + i + "</option>");
	   } else {
         out.println("<option>" + i + "</option>");
	   }
   }

      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("         </fieldset>\r\n");
      out.write("         \r\n");
      out.write("         <fieldset>\r\n");
      out.write("               <legend>월</legend>\r\n");
      out.write("            <select name=\"month\" class=\"select\">\r\n");

   for (int i=1; i<=12; i++) {
	   if(calendar.get(Calendar.MONTH) +1==i){
	         out.println("<option selected='selected'>" + i + "</option>");
		} else {
	         out.println("<option>" + i + "</option>");
		   }
         out.println("<option>" + i + "</option>");
   }

      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("         </fieldset>\r\n");
      out.write("         \r\n");
      out.write("         <input type=\"submit\" value=\"보기\" style=\"width: 50px; height: 30px\">\r\n");
      out.write("         </form>\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("	\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
