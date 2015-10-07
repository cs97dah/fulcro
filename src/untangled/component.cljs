(ns untangled.component
  (:refer-clojure :exclude [map meta time])
  (:require
    [untangled.state]
    [quiescent.dom :as d]
    [quiescent.core :include-macros true]
    [untangled.state :as state]))

;;;; !!!!!!!!!!!!!!!  WARNING  !!!!!!!!!!!!!!!!!!!
;;;; If you add functions to this file, be aware
;;;; that `map` and possibly other core fns will
;;;; be shadowed by the fns below!
;;;; !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

;(enable-console-print!)
;(defn dbg [x] (cljs.pprint/pprint x) x)

; You can use quiescent.dom directly, but these helpers make IntelliJ work better (otherwise they show up as undefined
; because a macro makes them
(defn a [attrs & children] (apply d/a attrs children))
(defn abbr [attrs & children] (apply d/abbr attrs children))
(defn address [attrs & children] (apply d/address attrs children))
(defn area [attrs & children] (apply d/area attrs children))
(defn article [attrs & children] (apply d/article attrs children))
(defn aside [attrs & children] (apply d/aside attrs children))
(defn audio [attrs & children] (apply d/audio attrs children))
(defn b [attrs & children] (apply d/b attrs children))
(defn base [attrs & children] (apply d/base attrs children))
(defn bdi [attrs & children] (apply d/bdi attrs children))
(defn bdo [attrs & children] (apply d/bdo attrs children))
(defn big [attrs & children] (apply d/big attrs children))
(defn blockquote [attrs & children] (apply d/blockquote attrs children))
(defn body [attrs & children] (apply d/body attrs children))
(defn br [attrs & children] (apply d/br attrs children))
(defn button [attrs & children] (apply d/button attrs children))
(defn canvas [attrs & children] (apply d/canvas attrs children))
(defn caption [attrs & children] (apply d/caption attrs children))
(defn cite [attrs & children] (apply d/cite attrs children))
(defn code [attrs & children] (apply d/code attrs children))
(defn col [attrs & children] (apply d/col attrs children))
(defn colgroup [attrs & children] (apply d/colgroup attrs children))
(defn data [attrs & children] (apply d/data attrs children))
(defn datalist [attrs & children] (apply d/datalist attrs children))
(defn dd [attrs & children] (apply d/dd attrs children))
(defn del [attrs & children] (apply d/del attrs children))
(defn details [attrs & children] (apply d/details attrs children))
(defn dfn [attrs & children] (apply d/dfn attrs children))
(defn div [attrs & children] (apply d/div attrs children))
(defn dl [attrs & children] (apply d/dl attrs children))
(defn dt [attrs & children] (apply d/dt attrs children))
(defn em [attrs & children] (apply d/em attrs children))
(defn embed [attrs & children] (apply d/embed attrs children))
(defn fieldset [attrs & children] (apply d/fieldset attrs children))
(defn figcaption [attrs & children] (apply d/figcaption attrs children))
(defn figure [attrs & children] (apply d/figure attrs children))
(defn footer [attrs & children] (apply d/footer attrs children))
(defn form [attrs & children] (apply d/form attrs children))
(defn h1 [attrs & children] (apply d/h1 attrs children))
(defn h2 [attrs & children] (apply d/h2 attrs children))
(defn h3 [attrs & children] (apply d/h3 attrs children))
(defn h4 [attrs & children] (apply d/h4 attrs children))
(defn h5 [attrs & children] (apply d/h5 attrs children))
(defn h6 [attrs & children] (apply d/h6 attrs children))
(defn head [attrs & children] (apply d/head attrs children))
(defn header [attrs & children] (apply d/header attrs children))
(defn hr [attrs & children] (apply d/hr attrs children))
(defn html [attrs & children] (apply d/html attrs children))
(defn i [attrs & children] (apply d/i attrs children))
(defn iframe [attrs & children] (apply d/iframe attrs children))
(defn img [attrs & children] (apply d/img attrs children))
(defn input [attrs & children] (apply d/input attrs children))
(defn ins [attrs & children] (apply d/ins attrs children))
(defn kbd [attrs & children] (apply d/kbd attrs children))
(defn keygen [attrs & children] (apply d/keygen attrs children))
(defn label [attrs & children] (apply d/label attrs children))
(defn legend [attrs & children] (apply d/legend attrs children))
(defn li [attrs & children] (apply d/li attrs children))
(defn link [attrs & children] (apply d/link attrs children))
(defn main [attrs & children] (apply d/main attrs children))
(defn mark [attrs & children] (apply d/mark attrs children))
(defn menu [attrs & children] (apply d/menu attrs children))
(defn menuitem [attrs & children] (apply d/menuitem attrs children))
(defn meta [attrs & children] (apply d/meta attrs children))
(defn meter [attrs & children] (apply d/meter attrs children))
(defn nav [attrs & children] (apply d/nav attrs children))
(defn noscript [attrs & children] (apply d/noscript attrs children))
(defn object [attrs & children] (apply d/object attrs children))
(defn ol [attrs & children] (apply d/ol attrs children))
(defn optgroup [attrs & children] (apply d/optgroup attrs children))
(defn option [attrs & children] (apply d/option attrs children))
(defn output [attrs & children] (apply d/output attrs children))
(defn p [attrs & children] (apply d/p attrs children))
(defn param [attrs & children] (apply d/param attrs children))
(defn pre [attrs & children] (apply d/pre attrs children))
(defn progress [attrs & children] (apply d/progress attrs children))
(defn q [attrs & children] (apply d/q attrs children))
(defn rp [attrs & children] (apply d/rp attrs children))
(defn rt [attrs & children] (apply d/rt attrs children))
(defn ruby [attrs & children] (apply d/ruby attrs children))
(defn s [attrs & children] (apply d/s attrs children))
(defn samp [attrs & children] (apply d/samp attrs children))
(defn script [attrs & children] (apply d/script attrs children))
(defn section [attrs & children] (apply d/section attrs children))
(defn select [attrs & children] (apply d/select attrs children))
(defn small [attrs & children] (apply d/small attrs children))
(defn source [attrs & children] (apply d/source attrs children))
(defn span [attrs & children] (apply d/span attrs children))
(defn strong [attrs & children] (apply d/strong attrs children))
(defn style [attrs & children] (apply d/style attrs children))
(defn sub [attrs & children] (apply d/sub attrs children))
(defn summary [attrs & children] (apply d/summary attrs children))
(defn sup [attrs & children] (apply d/sup attrs children))
(defn table [attrs & children] (apply d/table attrs children))
(defn tbody [attrs & children] (apply d/tbody attrs children))
(defn td [attrs & children] (apply d/td attrs children))
(defn textarea [attrs & children] (apply d/textarea attrs children))
(defn tfoot [attrs & children] (apply d/tfoot attrs children))
(defn th [attrs & children] (apply d/th attrs children))
(defn thead [attrs & children] (apply d/thead attrs children))
(defn time [attrs & children] (apply d/time attrs children))
(defn title [attrs & children] (apply d/title attrs children))
(defn tr [attrs & children] (apply d/tr attrs children))
(defn track [attrs & children] (apply d/track attrs children))
(defn u [attrs & children] (apply d/u attrs children))
(defn ul [attrs & children] (apply d/ul attrs children))
(defn var [attrs & children] (apply d/var attrs children))
(defn video [attrs & children] (apply d/video attrs children))
(defn wbr [attrs & children] (apply d/wbr attrs children))
(defn circle [attrs & children] (apply d/circle attrs children))
(defn g [attrs & children] (apply d/g attrs children))
(defn line [attrs & children] (apply d/line attrs children))
(defn path [attrs & children] (apply d/path attrs children))
(defn polygon [attrs & children] (apply d/polygon attrs children))
(defn polyline [attrs & children] (apply d/polyline attrs children))
(defn rect [attrs & children] (apply d/rect attrs children))
(defn svg [attrs & children] (apply d/svg attrs children))
(defn text [attrs & children] (apply d/text attrs children))

(defn build-list
  "Build out a rendered list.
  
  Named Parameters
  `context`: The context of your component (typically the one you are in now)
  `renderer`: The Render function generated by defscomponent for rendering an item
  `list-key`: The key (within component-with-list) of the vector of items (state)
  `item-key`: The key within each object that holds that object's unique key
  `event-listeners`: A map, keyed by events whose values are functions which take a list item's data and returns a function that will be called when that event is triggered by that item's UI.
  `filter`: A function that takes an item, and returns true to include it, false to not include it
  TODO: `sort-by` : A function that takes two items and otherwise works just like Clojure compare (-1 < 0 < 1)
  
  "
  [& {:keys [context renderer list-key item-key filter-fn event-listeners]}]
  (assert context "component context is required.")
  (assert renderer "renderer is required.")
  (assert list-key "list-key is required.")
  (assert item-key "item-key is required.")
  (let [state (state/context-data context)
        items (get state list-key)
        events (keys event-listeners)
        listener-ctor (fn [evt item] ((get event-listeners evt) item))
        item-listeners (fn [item] (into {} (cljs.core/map (fn [e] (vector e (listener-ctor e item))) events)))
        ]
    (keep-indexed (fn [idx item]
                    (if (or (not filter-fn) (and filter-fn (filter-fn item)))
                      (let [args (cond-> [(state/list-element-id state list-key item-key idx) context]
                                         event-listeners (concat [:event-listeners (item-listeners item)]))]
                        (apply renderer args))
                      nil
                      ))
                  items)
    ))

(defn render-mapped-list
  "Applies renderer over 'orderable' map-of-maps.

  Required Positional Parameters:
  - `renderer`:      A defscomponent render fn.
  - `data`:          Data (as provided to defscomponent).
  - `context`:       Context (as provided to defscomponent).
  - `target-key`:    The key in `data` to reach sub-maps.
  - `sort-by-keyfn`: A fn much like `sort-by`'s keyfn.

  Optional Keyword Parameters:
  - `filter-fn`:     A filter fn to be applied to sub-maps.  Defaults to `identity`.
  - `comparator`:    A comparator to change sort order.  Defaults to `compare`.
  "
  [renderer data context target-key sort-by-keyfn
   & {:keys [filter-fn comparator]
      :or   {filter-fn  identity
             comparator compare}}]
  {:pre [(every? (comp not nil?) [renderer data context target-key sort-by-keyfn])
         (every? map? [data (get data target-key)])
         (every? fn? [renderer filter-fn])
         (or (keyword? sort-by-keyfn) (fn? sort-by-keyfn))]}
  (let [sub-context (state/new-sub-context context target-key {})
        render-sub-context-for (fn [child-key] (renderer child-key sub-context))
        target-map (get data target-key)
        ks (->> target-map
                (filter (fn [[_k v]] (filter-fn v)))
                (sort-by (fn [[_k v]] (sort-by-keyfn v)) comparator)
                (cljs.core/map first))]
    (cljs.core/map render-sub-context-for ks)))
