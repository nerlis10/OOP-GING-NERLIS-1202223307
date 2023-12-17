import java.util.ArrayList;
class Student extends User {
    protected ArrayList<String> enrolledCourses;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        StringBuilder details = new StringBuilder("Student - Name: " + name + ", ID: " + id + "\nEnrolled Courses: [ ");
        for (String course : enrolledCourses) {
            details.append(course).append(", ");
        }
        if (!enrolledCourses.isEmpty()) {
            details.delete(details.length() - 2, details.length()); // Hapus koma ekstra
        }
        details.append(" ]\n");
        return details.toString();
    }
}

