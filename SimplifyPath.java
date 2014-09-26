public class SimplifyPath{

/*
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
*/
  public String simplifyPath(String path) {
       Stack<String> stack = new   Stack<String>();
      
      // multiple / to a single /
      // if .. is encountered, pop up one element
      // valid name push in stack
      // skip .
      
       char ch = path.charAt(0);
       int i = 0;
       
       while (i < path.length()){
        
        // skip the leading '/'
        while ( i < path.length() && (ch = path.charAt(i)) == '/'){
          i++;
       }
       
       if (i >= path.length()) break;
       // find a valid name
        StringBuffer name = new StringBuffer();
        while (i < path.length() && (ch = path.charAt(i)) != '/'){
          i ++;
          name.append(ch);
        }
        if (name.toString().equals("..")){
          if (!stack.empty())
              stack.pop();
        }
        else if (!name.toString().equals(".")){
              stack.push(name.toString());
        }
  }
  ArrayList<String> res = new ArrayList<String>();
	  while (!stack.empty()){
	        res.add(stack.pop());
	    }
	 	StringBuffer simple = new StringBuffer();
		simple.append("/");
		for ( i = res.size()-1; i >= 0; i--){
		    if (i > 0)
		        simple.append(res.get(i)+"/");
		    else
		        simple.append(res.get(i));
		}
		    
	 return simple.toString();
}
