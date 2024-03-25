const hello = () => alert("It work (somehow)");
hello();


async function logMovies() {
  const response = await fetch("http://example.com/movies.json");
  const movies = await response.json();
  console.log(movies);
}