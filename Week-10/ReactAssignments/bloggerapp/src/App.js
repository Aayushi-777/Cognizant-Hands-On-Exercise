import "./App.css";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";
import { books, blogs, courses } from "./Data";
function App() {
    const showCourses = true;
    const showBooks = true;
    const showBlogs = true;
    return (
        <div className="container">
            {
                showCourses &&
                <CourseDetails courses={courses} />
            }
            {
                showBooks &&
                <BookDetails books={books} />
            }
            {
                showBlogs &&
                <BlogDetails blogs={blogs} />
            }
        </div>
    );
}
export default App;