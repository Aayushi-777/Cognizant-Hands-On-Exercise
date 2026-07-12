import React, { Component } from "react";
class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }
    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {
                this.setState({
                    posts: data
                });
            })
            .catch(error => {
                console.log(error);
            });
    }
    componentDidMount() {
        this.loadPosts();
    }
    componentDidCatch(error, info) {
        console.log(error);
        console.log(info);
        this.setState({
            hasError: true
        });
    }
    render() {
        if (this.state.hasError) {
            return <h2>Error Loading Posts</h2>;
        }
        return (
            <div>
                <h1>Blog Posts</h1>
                {
                    this.state.posts.map(post => (
                        <div key={post.id} style={{marginBottom:"20px"}}>
                            <h3>{post.title}</h3>
                            <p>{post.body}</p>
                            <hr/>
                        </div>
                    ))
                }
            </div>
        );
    }
}
export default Posts;