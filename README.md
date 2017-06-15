# leapyears

clojurescript app that listens for input and writes to the screen if the input is a leapyear.

## Overview

FIXME: Write a paragraph about the library/project and highlight its goals.

## Setup

Build your project once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

To auto build your project in dev mode:

    ./scripts/watch

To start a browser REPL:

1. Run `./scripts/brepl`
2. Browse to `http://localhost:9000` (you should see `Hello world!` in the web console)
3. (back to step 3) you should now see the REPL prompt: `cljs.user=>`
4. You may now evaluate ClojureScript statements in the browser context.

For more info using the browser as a REPL environment, see
[this](https://github.com/clojure/clojurescript/wiki/The-REPL-and-Evaluation-Environments#browser-as-evaluation-environment).

Clean project specific out:

    lein clean

Build a single release artifact with the following script and then open `index_release.html` in your browser.

    ./scripts/release

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
