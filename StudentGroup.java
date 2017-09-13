import java.util.Date;
import java.util.*;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	Scanner sc= new Scanner(System.in);

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if (students.length == 0)
			throws new IllegalArgumentException ;
		else
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		//int i = 1;
		//double j=80 ;
		//String name = "A b";
		if (students.length == 0)
			throws new IllegalArgumentException ;
		else {
			for ( int k = 0 ; k < students.length ; k++  )
			{
				this.students[k] = new Student(students[k].getId(), students[k].getFullName(),students[k].getBirthDate,students[k].getAvgMark());
			}
		}

	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if (index < 0 || index >= students.length)
			throws new IllegalArgumentException ;
		else
		{
			for ( int k = 0 ; k students[k-1].setId(students[k].getId());< students.length ; k++ )
			{
				if (index == k)
					return students[k] ;
			}
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		//student = new Student()
		if (index < 0 || index >= students.length || students == null )
				throws new IllegalArgumentException ;
		else
		{
			for ( int k = 0 ; k < students.length ; k++ )
			{
				if ( index == k)
				{
					students[k].setId(student.getId());
					students[k].setFullName(student.getFullName());
					students[k].setBirthDate(student.getBirthDate());
					students[k].setAvgMark(student.getAvgMark());
				}
			}
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if (students == null )
			throws new IllegalArgumentException ;
		else
		{
            if (students.length == 0)
                students[0] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());

			else{
                    for(int k = students.length+1 ; k>=1  ; k-- )
                    {
                    students[k].setId(students[k-1].getId()) ;
                    students[k].setFullName(students[k-1].getFullName())  ;
                    students[k].setBirthDate(students[k-1].getBirthDate())  ;
                    students[k].setAvgMark(students[k-1].getAvgMark())  ;
                    }
			}

		}
		if (k == 0)
			students[k] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int k = students.length ;
		if (students == null)
			throws new IllegalArgumentException ;
		else
		{
			if (students.length == 0 )
            {
              students[0] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
            }
            else
            {
                students[k+1] = new Student(student.getId(),student.getFullName(),student.getBirthDate(),student.getAvgMark());
            }

		}students[k-1].setId(students[k].getId());
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if (student == null )
            throws new IllegalArgumentException;
        if (students.length == 0)
            addFirst(student);
        else if (students.length+1 == index )
            addLast(student);
        else
        {
            for ( int k = index ; k < students.length +1 ; k++ )
            {
                students[k+1].setId(students[k].getId());
                students[k+1].setFullName(students[k].getFullName());
                students[k+1].setBirthDate(students[k].getBirthDate());
                students[k+1].setAvgMark(students[k].getAvgMark());
            }
        }
        students[index] = new Student(student.getID(), student.getFullName() , student.getBirthDate(), student.getAvgMark() );
	}

	@Override
	public void remove(int index) {
		// Add your implementatstudents[k-1].setId(students[k].getId());ion here
		if (index == 0)
        {
            //remove the zeroth position and precede all
            for ( int k = 1; k <students.length ; k++ )
            {
                students[k-1].setId(students[k].getId());
                students[k-1].setFullName(students[k].getFullName());
                students[k-1].setBirthDate(students[k].getBirthDate());
                students[k-1].setAvgMark(students[k].getAvgMark());
            }
        }
        else if (index == student.length)
        {
            //delete last pos and assign length to length-1
            Student[] st1 ;
            for (int k = 0 ; k < students.length-1 ; k++)
                st1 = students;

        }
        else
        {
            // take new array and send the elements other than the given index
        }
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
