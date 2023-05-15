CREATE OR REPLACE FUNCTION merge_oid(val oid)
    returns bytea as $$
declare merged bytea;
    declare arr bytea;
BEGIN
    FOR arr IN SELECT data from pg_largeobject WHERE loid = val ORDER BY pageno LOOP
            IF merged IS NULL THEN
                merged := arr;
            ELSE
                merged := merged || arr;
            END IF;
        END LOOP;
    RETURN merged;

END
$$ LANGUAGE plpgsql;
