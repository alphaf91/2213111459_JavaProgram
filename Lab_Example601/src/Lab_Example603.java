import javax.swing.JOptionPane;

public final class Lab_Example603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptName = {"Account","HR","Sales","Innovation"};
		boolean deptISFound = false;
		
		String dept = JOptionPane.showInputDialog("Enter a department name");
		
		for ( int i = 0; i < deptName.length; i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptISFound = true;
			}
		}
		JOptionPane.showMessageDialog(null, (deptISFound)
				? dept +"was found in the list"
			    : dept +"was not found in the list");
		

	}

}
