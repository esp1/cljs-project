# cljs-project

My ClojureScript project template. Uses [shadow-cljs](https://shadow-cljs.github.io/) build, [tailwind](https://tailwindcss.com/) css, and the [helix](https://github.com/Lokeh/helix) React library.

## Usage

Build a deployable jar of this template:

    $ clojure -A:jar

Install it locally:

    $ clojure -A:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -A:deploy

## License

Copyright © 2020 Edwin Park

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
