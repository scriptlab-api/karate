function fn() {

  var env = karate.env;

  if (!env) {
    env = 'dev';
  }

  var config = {
    baseUrl: 'https://jsonplaceholder.typicode.com'
  };

  return config;
}